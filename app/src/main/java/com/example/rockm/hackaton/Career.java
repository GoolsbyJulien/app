package com.example.rockm.hackaton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class Career extends Activity implements AdapterView.OnItemClickListener {
    private double total_hours;

    public static ArrayList<Job> comJobs = new ArrayList<>();

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.created);
        createJobs();


        list = (ListView) findViewById(R.id.listview);

        AdapterViewCustom adapter = new AdapterViewCustom(this, comJobs);
        list.setAdapter(adapter);

     //   list.setOnItemClickListener(this);
    }




public void open(Job j) {
        Intent i = new Intent(this,jobScreen.class);


        i.putExtra("Name", j.getName());
        i.putExtra("Describe",j.getDescription());
        startActivity(i);

    }

    public void onItemClick(android.widget.AdapterView<?> parent,
                            View view, int position, long id) {
        Toast.makeText(getApplicationContext(),
                comJobs.get(position).getName(), Toast.LENGTH_LONG).show();
    }

    private static boolean hasRan;
    public void createJobs() {
        if(!hasRan) {
            comJobs.add(new Job("McDonalds", "www.placeholder.com","29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Manager"));
            comJobs.add(new Job("Starbucks ","www.placeholder.com", "29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Barista"));
            comJobs.add(new Job("School","www.placeholder.com", "29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Substitute teacher"));
            comJobs.add(new Job("Pizza hut","www.placeholder.com", "29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Manager"));
            comJobs.add(new Job("McDonalds", "www.placeholder.com","29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Manager"));
            comJobs.add(new Job("Starbucks ","www.placeholder.com", "29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Barista"));
            comJobs.add(new Job("School","www.placeholder.com", "29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Substitute teacher"));
            comJobs.add(new Job("Pizza hut","www.placeholder.com", "29$ per hour", "Kansas city", "test@gmail.com", "111-111-111", "Manager"));
          hasRan  =true;
        }
    }}