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

public class HorrorDetail extends AppCompatActivity {
    public static final String EXTRA_HORROR_ID = "horrorId";
    public static final String EXTRA_HORROR_DETAIL = "horror";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //Display details of the pizza

        int horrorId = (Integer)getIntent().getExtras().get(EXTRA_HORROR_ID);
        String horrorName = Horror.horrors[horrorId].getName();
        TextView textView = (TextView)findViewById(R.id.horror_text);
        textView.setText(horrorName);

        int horrorImage = Horror.horrors[horrorId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.horror_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,horrorImage));
        imageView.setContentDescription(horrorName);

        int horror = (Integer)getIntent().getExtras().get(EXTRA_HORROR_DETAIL);
        String horrorDetail = Horror.horrors[horror].getDetail();
        TextView textViews = (TextView)findViewById(R.id.horror_detail);
        textViews.setText(horrorDetail);
    }
    public void click (View view){
        Intent intent = new Intent(HorrorDetail.this,OrderActivity.class);
        startActivity(intent);
    }
}