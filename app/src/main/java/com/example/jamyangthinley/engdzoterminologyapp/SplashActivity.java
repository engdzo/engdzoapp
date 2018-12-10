package com.example.jamyangthinley.engdzoterminologyapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.hamza.slidingsquaresloaderview.SlidingSquareLoaderView;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

   // private static int splashTimeOut=2500;
   private SlidingSquareLoaderView slidingSquareLoaderView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        }, splashTimeOut);*/

        //slide loader for splash page
        slidingSquareLoaderView=findViewById(R.id.loader);
        slidingSquareLoaderView.start();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            slidingSquareLoaderView.stop();
                            startActivity(new Intent(SplashActivity.this,MainActivity.class));
                        }
                    });
                }
            }
        });
        thread.start();
    }
    protected void onPause(){
        super.onPause();
        finish();

    }
}
