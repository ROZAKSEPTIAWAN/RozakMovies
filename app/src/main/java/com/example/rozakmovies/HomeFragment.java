package com.example.rozakmovies;

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


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment


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

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(homeNames, homeImages);
        homeRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        homeRecycler.setLayoutManager(layoutManager);
//        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
//        homeRecycler.setLayoutManager(layoutManager);
        return homeRecycler;
    }
    }
