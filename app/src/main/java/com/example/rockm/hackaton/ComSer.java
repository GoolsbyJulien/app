package com.example.rockm.hackaton;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ComSer extends AppCompatActivity   implements NavigationView.OnNavigationItemSelectedListener {
    private double total_hours;

    public static ArrayList<Job> comJobs = new ArrayList<>();

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.created2);
        createJobs();


        list = (ListView) findViewById(R.id.listview);

        AdapterViewCustom adapter = new AdapterViewCustom(this, comJobs);
       /* list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        "text", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

        list.setAdapter(adapter);

      /*  list.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent,
                                    View view, int position, long id) {


            }
        });*/


       /*
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
*/

    }public void createJobs() {
        //name = name of organization
        //description is
        //Slides at Church
        //Soup Kitchen
        //Sweeping floors

        comJobs.add(new Job("Holy Family Church " ,"www.placeholder.com","3 hours", "Kansas city", "test@gmail.com","111-111-111" , "Slides at service"));
        comJobs.add(new Job("Soup Kitchen ","www.placeholder.com","5 hours", "Kansas city", "test@gmail.com","111-111-111" , "Give out soup"));
        comJobs.add(new Job("Staley High School ","www.placeholder.com"," 4 hour", "Kansas city", "test@gmail.com","111-111-111" , "Pick up trash"));
        comJobs.add(new Job("Sunrise Senior Living ","www.placeholder.com","3 hours", "Kansas city", "test@gmail.com","111-111-111" ,"Visit with elderly"));



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.ComSer) {

            Intent intent = new Intent(this, ComSer.class);
            startActivity(intent);
        } else if (id == R.id.Career) {
            Intent intent = new Intent(this, Career.class);
            startActivity(intent);

        } else if (id == R.id.tut) {
            Intent intent = new Intent(this, Tutoring.class);
            startActivity(intent);
        } else if (id == R.id.fav) {

        } else if (id == R.id.set) {

        } else if (id == R.id.log) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
