package com.example.onepieceview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharactersInfo charactersInfo = new CharactersInfo();
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, charactersInfo);
        fragmentTransaction.commit();
    }

    public void funcSecFrag() {

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ListOfCharacters listOfCharacters = new ListOfCharacters();
        fragmentTransaction.replace(R.id.frameLayout, listOfCharacters).commit();
    }

}