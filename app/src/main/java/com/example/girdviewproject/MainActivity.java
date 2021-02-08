package com.example.girdviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private String [] country_name;
    private int [] flags = {R.drawable.afgan_flag,R.drawable.bangladesh_flag,
            R.drawable.bhuta_flag,R.drawable.chinaflag_here,R.drawable.germany_flag,
            R.drawable.india_flag,R.drawable.meyanmar_flag,R.drawable.nepal_flag,
            R.drawable.pakflag_flag,R.drawable.russia_flag};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView  = (GridView) findViewById(R.id.gridViewId);
        country_name = getResources().getStringArray(R.array.country_list);

        CoustomAdapter coustomAdapter =  new  CoustomAdapter(this,country_name,flags);
        gridView.setAdapter(coustomAdapter);

    }
}