package com.example.rozakmovies;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScienceDetail extends AppCompatActivity {

    public static final String EXTRA_SCIENCE_ID = "scienceId";
    public static final String EXTRA_SCIENCE_DETAIL = "home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //Display details of the pizza

        int homeId = (Integer)getIntent().getExtras().get(EXTRA_SCIENCE_ID);
        String scienceName = Science.sciences[homeId].getName();
        TextView textView = (TextView)findViewById(R.id.science_text);
        textView.setText(scienceName);

        int homeImage = Science.sciences[homeId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.science_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,homeImage));
        imageView.setContentDescription(scienceName);

        int home = (Integer)getIntent().getExtras().get(EXTRA_SCIENCE_DETAIL);
        String scienceDetail = Science.sciences[home].getDetail();
        TextView textViews = (TextView)findViewById(R.id.science_detail);
        textViews.setText(scienceDetail);
    }
    public void click (View view){
        Intent intent = new Intent(ScienceDetail.this,OrderActivity.class);
        startActivity(intent);
    }
}