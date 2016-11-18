package com.jiuxin.jiugongge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MyGridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview= (MyGridView) findViewById(R.id.gridview);


        gridview.setAdapter(new MyGridAdapter(this));


    }

}
