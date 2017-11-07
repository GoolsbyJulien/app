package com.example.rockm.hackaton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Favoirtes extends AppCompatActivity {
    public static ArrayList<Job> Fav = new ArrayList<>();
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoirtes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        list = (ListView) findViewById(R.id.favList);

        AdapterViewCustom adapter = new AdapterViewCustom(this, Fav);
        list.setAdapter(adapter);
    }
public void add(){
for(Job j : Career.comJobs) {
    if(j.getIsFav())
        Fav.add(j);
}
    for(Job j : ComSer.comJobs) {
        if(j.getIsFav())
            Fav.add(j);
    }for(Job j : Internships.comJobs) {
        if(j.getIsFav())
            Fav.add(j);
    }for(Job j : Tutoring.comJobs) {
        if(j.getIsFav())
            Fav.add(j);
    }


}
}
