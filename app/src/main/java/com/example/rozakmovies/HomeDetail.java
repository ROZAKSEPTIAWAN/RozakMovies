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

public class HomeDetail extends AppCompatActivity {

    public static final String EXTRA_HOME_ID = "homeId";
    public static final String EXTRA_HOME_DETAIL = "home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //Display details of the pizza

        int homeId = (Integer)getIntent().getExtras().get(EXTRA_HOME_ID);
        String homeName = Home.homes[homeId].getName();
        TextView textView = (TextView)findViewById(R.id.home_text);
        textView.setText(homeName);

        int homeImage = Home.homes[homeId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.home_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,homeImage));
        imageView.setContentDescription(homeName);

        int home = (Integer)getIntent().getExtras().get(EXTRA_HOME_DETAIL);
        String homeDetail = Home.homes[home].getDetail();
        TextView textViews = (TextView)findViewById(R.id.home_detail);
        textViews.setText(homeDetail);
    }

    public void click (View view){
        Intent intent = new Intent(HomeDetail.this,OrderActivity.class);
        startActivity(intent);
    }
}