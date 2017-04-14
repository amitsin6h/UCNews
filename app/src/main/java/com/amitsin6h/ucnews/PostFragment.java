package com.amitsin6h.ucnews;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PostFragment extends Fragment {

    RecyclerView recyclerView;


    public PostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post, container, false);

        //loading the recyclerview inside fragment
        recyclerView = (RecyclerView) view.findViewById(R.id.post_recyclerview);
        ReadRss readRss = new ReadRss(getActivity(),recyclerView);
        readRss.execute();


        return  view;
    }

}
