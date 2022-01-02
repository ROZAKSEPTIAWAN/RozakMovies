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

public class AdventureDetail extends AppCompatActivity {
    public static final String EXTRA_ADVENTURE_ID = "adventureId";
    public static final String EXTRA_ADVENTURE_DETAIL = "adventure";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_detail);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //Display details of the pizza

        int adventureId = (Integer)getIntent().getExtras().get(EXTRA_ADVENTURE_ID);
        String adventureName = Adventure.adventures[adventureId].getName();
        TextView textView = (TextView)findViewById(R.id.adventure_text);
        textView.setText(adventureName);

        int adventureImage = Adventure.adventures[adventureId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.adventure_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,adventureImage));
        imageView.setContentDescription(adventureName);

        int adventure = (Integer)getIntent().getExtras().get(EXTRA_ADVENTURE_DETAIL);
        String homeDetail = Adventure.adventures[adventure].getDetail();
        TextView textViews = (TextView)findViewById(R.id.adventure_detail);
        textViews.setText(homeDetail);


    }
    public void click (View view){
        Intent intent = new Intent(AdventureDetail.this,OrderActivity.class);
        startActivity(intent);
    }
}