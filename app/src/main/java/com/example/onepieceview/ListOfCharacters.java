package com.example.onepieceview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListOfCharacters#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListOfCharacters extends Fragment {

    RecyclerView recyclerView;
    ArrayList images, name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_of_characters, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        images = new ArrayList();
        name = new ArrayList();

        for (int i = 0; i < Data.names.length; i++)
        {
            images.add(Data.images);
            name.add(Data.names);
        }

        HelperAdapter helperAdapter = new HelperAdapter(getContext(), images, name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(helperAdapter);

        return view;
    }
}