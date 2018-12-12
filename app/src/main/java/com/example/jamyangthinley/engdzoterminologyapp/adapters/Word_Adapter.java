package com.example.jamyangthinley.engdzoterminologyapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jamyangthinley.engdzoterminologyapp.DefinitionActivity;
import com.example.jamyangthinley.engdzoterminologyapp.R;
import com.example.jamyangthinley.engdzoterminologyapp.utils.DictionaryModel;

import java.util.List;

/**
 * Created by Srh Dp on 30-Jun-17.
 */

public class Word_Adapter extends RecyclerView.Adapter<Word_Adapter.ViewHolder> {

    public List<DictionaryModel> data;

    public Word_Adapter(){}
    public void setData(List<DictionaryModel> data){
        this.data=data;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);

        View wordView=inflater.inflate(R.layout.word_item,parent,false);

        ViewHolder viewHolder=new ViewHolder(wordView,context);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DictionaryModel dictionaryModel=data.get(position);
        holder.termText.setText(dictionaryModel.getTerm());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public Context context;
        public TextView termText;
        public ViewHolder(View itemView, final Context context) {
            super(itemView);
            this.context=context;
            termText=(TextView) itemView.findViewById(R.id.termtext);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position=getAdapterPosition();
                    DictionaryModel dictionaryModel=data.get(position);

                    Intent intent=new Intent(context, DefinitionActivity.class);
                    intent.putExtra("TERM",dictionaryModel.getTerm());
                    intent.putExtra("DEFINITION",dictionaryModel.getDefinition());
                    intent.putExtra("ACRONYMS",dictionaryModel.getAcronyms());
                    intent.putExtra("WORDCLASS",dictionaryModel.getWordclass());
                    intent.putExtra("DZONGKHAEQUIVALENT",dictionaryModel.getDzongkhaequivalent());
                    intent.putExtra("CATEGORY",dictionaryModel.getCategory());

                    context.startActivity(intent);
                }
            });
        }
    }
}

