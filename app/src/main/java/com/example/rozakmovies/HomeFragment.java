package com.example.rozakmovies;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;


public class HomeFragment extends Fragment {

    private SQLiteDatabase db;
    private Cursor cursor;
    private Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView homeRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_home, container, false);

        String[] homeNames = new String[Home.homes.length];
        for (int i = 0; i < homeNames.length; i++) {
            homeNames[i] = Home.homes[i].getName();
        }
        int[] homeImages = new int[Home.homes.length];
        for (int i = 0; i < homeImages.length; i++) {
            homeImages[i] = Home.homes[i].getImageResourceId();
        }

        String[] homeDetail = new String[Home.homes.length];
        for (int i = 0; i < homeDetail.length; i++) {
            homeDetail[i] = Home.homes[i].getDetail();
        }



        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(homeNames, homeImages);
        homeRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        homeRecycler.setLayoutManager(layoutManager);
//        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
//        homeRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), HomeDetail.class);
                intent.putExtra(HomeDetail.EXTRA_HOME_ID, position);
                intent.putExtra(HomeDetail.EXTRA_HOME_DETAIL, position);
                getActivity().startActivity(intent);
            }
        });
        return homeRecycler;
    }
    }
