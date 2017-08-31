package com.example.gouxinyue.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class TestActivity3 extends Activity {
    private MyView3 mMyView3 =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        mMyView3= (MyView3) findViewById(R.id.myview3xx);
        //Log.i("midtest-","xxx  "+((char)(new Byte((byte)0).intValue())));
       // mMyView3.setOrientation();
        if(mMyView3==null){
            Log.d("xxxxx","X");
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMyView3.setOrientation();
            }
        });
    }

}
