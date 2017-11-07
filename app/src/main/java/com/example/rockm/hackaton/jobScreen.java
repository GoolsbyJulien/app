package com.example.rockm.hackaton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class jobScreen extends Activity {
   public static Job j ;
    private CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_screen);


        TextView jobName = findViewById(R.id.job_title);
        TextView Des = findViewById(R.id.Des_box);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView web = findViewById(R.id.web);

        Intent intent = getIntent();
    j = (Job)intent.getSerializableExtra("Job");
        jobName.setText(intent.getStringExtra("Name"));
        Des.setText(intent.getStringExtra("Describe"));
        Button b = findViewById(R.id.save_button1);
        email.setText(j.getEmail());
        phone.setText(j.getPhone());
        web.setText(j.getWeb());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = findViewById(R.id.favoite);

                if(c.isChecked()) {

                    Toast.makeText(getApplicationContext(), j.getName() + "added to favorites ", Toast.LENGTH_SHORT);
                    Favoirtes.Fav.add(j);
                }
                finish();
            }
        });

    }

}
