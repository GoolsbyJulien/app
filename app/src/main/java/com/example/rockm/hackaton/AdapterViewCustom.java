package com.example.rockm.hackaton;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by rockm on 11/4/2017.
 */
public class AdapterViewCustom extends BaseAdapter {

    private Activity context_1;

    private ArrayList<Job> pairs;

    public AdapterViewCustom(Activity context,
                             ArrayList<Job> pairs) {
        context_1 = context;
        this.pairs = pairs;


    }

    @Override
    public int getCount() {
        return pairs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        ViewHolder viewHolder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(context_1).inflate(
                    R.layout.customrow, null);
            viewHolder = new ViewHolder();

          viewHolder.name= (TextView) convertView.findViewById(R.id.companyName);
          viewHolder.number= (TextView) convertView.findViewById(R.id.phoneN);
            viewHolder.describe= (TextView) convertView.findViewById(R.id.describe);
            viewHolder.web= (TextView) convertView.findViewById(R.id.website);
            viewHolder.level= (TextView) convertView.findViewById(R.id.level);


            /**
             * At very first time when the List View row Item control's
             * instance is created it will be store in the convertView as a
             * ViewHolder Class object for the reusability purpose
             **/
            convertView.setTag(viewHolder);
        } else {
            /**
             * Once the instance of the row item's control it will use from
             * already created controls which are stored in convertView as a
             * ViewHolder Instance
             * */
            viewHolder = (ViewHolder) convertView.getTag();
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context_1,jobScreen.class);


                // To retrieve object in second Activity
                    i.putExtra("Job",pairs.get(position));
                i.putExtra("Name",pairs.get(position).getName());
                  i.putExtra("Describe",pairs.get(position).getDescription());
                  context_1.startActivity(i);

            }});
if(pairs.get(position) != null) {
    viewHolder.name.setText(pairs.get(position).getName());
    viewHolder.number.setText(pairs.get(position).getPhone());
    viewHolder.describe.setText(pairs.get(position).getName());
    viewHolder.web.setText(pairs.get(position).getLocation());
}
        viewHolder.level.setText(position +1 + "");




        /*int

         id = context_1.getResources().getIdentifier(
                pairs.get(position)., "drawable",
                context_1.getPackageName());
        viewHolder.img.setImageResource(id);
*/
        return convertView;
    }

    public class ViewHolder {
        public  ImageView img =null;
        public  TextView name = null;
        public  TextView describe = null;
        public  TextView web = null;
        public  TextView number = null;
        public  TextView level = null;



    }

}