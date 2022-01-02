package com.example.rozakmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ScienceFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_science, container, false);
        RecyclerView scienceRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_science, container, false);

        String[] scienceNames = new String[Science.sciences.length];
        for (int i = 0; i < scienceNames.length; i++) {
            scienceNames[i] = Science.sciences[i].getName();
        }
        int[] scienceImages = new int[Science.sciences.length];
        for (int i = 0; i < scienceImages.length; i++) {
            scienceImages[i] = Science.sciences[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(scienceNames, scienceImages);
        scienceRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        scienceRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), ScienceDetail.class);
                intent.putExtra(ScienceDetail.EXTRA_SCIENCE_ID, position);
                intent.putExtra(ScienceDetail.EXTRA_SCIENCE_DETAIL, position);
                getActivity().startActivity(intent);
            }
        });
        return scienceRecycler;

    }
}