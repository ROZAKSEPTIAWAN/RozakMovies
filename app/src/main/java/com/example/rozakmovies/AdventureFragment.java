package com.example.rozakmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AdventureFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_adventure, container, false);

        RecyclerView adventureRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_adventure, container, false);

    String[] adventureNames = new String[Adventure.adventures.length];
        for (int i = 0; i < adventureNames.length; i++) {
        adventureNames[i] = Adventure.adventures[i].getName();
    }
    int[]  adventureImages = new int[Adventure.adventures.length];
        for (int i = 0; i < adventureImages.length; i++) {
        adventureImages[i] = Adventure.adventures[i].getImageResourceId();
    }

    CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(adventureNames, adventureImages);
        adventureRecycler.setAdapter(adapter);
    GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        adventureRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), AdventureDetail.class);
                intent.putExtra(AdventureDetail.EXTRA_ADVENTURE_ID, position);
                intent.putExtra(AdventureDetail.EXTRA_ADVENTURE_DETAIL, position);
                getActivity().startActivity(intent);
            }
        });

        return adventureRecycler;
    }
}