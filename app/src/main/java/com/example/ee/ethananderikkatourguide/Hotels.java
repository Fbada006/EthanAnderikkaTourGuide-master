package com.example.ee.ethananderikkatourguide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class Hotels extends Activity {


    ArrayList<TourDetails> features = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_DeviceDefault_Light);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        features.add(new TourDetails("Hotel Name", "Hotel Location"));
        features.add(new TourDetails("Hotel Name", "Hotel Location"));
        features.add(new TourDetails("Hotel Name", "Hotel Location"));
        features.add(new TourDetails("Hotel Name", "Hotel Location"));
        features.add(new TourDetails("Hotel Name", "Hotel Location"));


        HotelListAdapter adapter = new HotelListAdapter(this, features);

        ListView listView = findViewById(R.id.myplaylists);
        listView.setAdapter(adapter);
    }

}