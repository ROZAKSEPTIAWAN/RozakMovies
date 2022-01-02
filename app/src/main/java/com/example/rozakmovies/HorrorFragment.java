package com.example.rozakmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HorrorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_horror, container, false);
        RecyclerView horrorRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_horror, container, false);

        String[] horrorNames = new String[Horror.horrors.length];
        for (int i = 0; i < horrorNames.length; i++) {
            horrorNames[i] = Horror.horrors[i].getName();
        }
        int[] horrorImages = new int[Horror.horrors.length];
        for (int i = 0; i < horrorImages.length; i++) {
            horrorImages[i] = Horror.horrors[i].getImageResourceId();
        }

        String[] horrorDetail = new String[Horror.horrors.length];
        for (int i = 0; i < horrorDetail.length; i++) {
            horrorDetail[i] = Horror.horrors[i].getDetail();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(horrorNames, horrorImages);
        horrorRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        horrorRecycler.setLayoutManager(layoutManager);


        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), HorrorDetail.class);
                intent.putExtra(HorrorDetail.EXTRA_HORROR_ID, position);
                intent.putExtra(HorrorDetail.EXTRA_HORROR_DETAIL, position);
                getActivity().startActivity(intent);
            }
        });
        return horrorRecycler;
    }
}