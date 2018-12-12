package com.example.jamyangthinley.engdzoterminologyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DefinitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        String term=getIntent().getStringExtra("TERM");
        String acronyms=getIntent().getStringExtra("ACRONYMS");
        String wordclass=getIntent().getStringExtra("WORDCLASS");
        String dzongkhaequivalent=getIntent().getStringExtra("DZONGKHAEQUIVALENT");
        String defintion=getIntent().getStringExtra("DEFINITION");
        String category=getIntent().getStringExtra("CATEGORY");


        TextView termText= (TextView) findViewById(R.id.termtext);
        TextView acronymsText= (TextView) findViewById(R.id.acronymstext);
        TextView wordclassText= (TextView) findViewById(R.id.wordclasstext);
        TextView dzongkhaequivalentText= (TextView) findViewById(R.id.dzongkhaequivalenttext);
        TextView categoryText= (TextView) findViewById(R.id.categorytext);
        TextView definitionText= (TextView) findViewById(R.id.definitiontext);


        termText.setText(term);
        acronymsText.setText(acronyms);
        wordclassText.setText(wordclass);
        dzongkhaequivalentText.setText(dzongkhaequivalent);
        categoryText.setText(category);
        definitionText.setText(defintion);
    }
}

