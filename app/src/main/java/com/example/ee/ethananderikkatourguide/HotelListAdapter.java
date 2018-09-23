package com.example.ee.ethananderikkatourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HotelListAdapter extends ArrayAdapter<TourDetails> {

    HotelListAdapter(Activity context, ArrayList<TourDetails> features) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, features);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_hotels, parent, false);
        }

        TourDetails currentTourDetails = getItem(position);

        TextView featureName = listItemView.findViewById(R.id.feature_name);
        if (currentTourDetails != null) {
            featureName.setText(currentTourDetails.getFeatureName());
        }

        TextView featureLocation = listItemView.findViewById(R.id.feature_location);
        if (currentTourDetails != null) {
            featureLocation.setText(currentTourDetails.getLocation());
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
