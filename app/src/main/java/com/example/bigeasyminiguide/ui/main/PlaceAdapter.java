package com.example.bigeasyminiguide.ui.main;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigeasyminiguide.R;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     */

    public PlaceAdapter(Context context, ArrayList<Place> places) {


        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace= getItem(position);

        // Find the TextView in the list_item.xml layout with the place_title text
        TextView placeTitle = (TextView) listItemView.findViewById(R.id.place_title);
        // Get the version name from the current Place object and set this text on the name TextView
        placeTitle.setText(currentPlace.getPlaceTitle());

        // Find the TextView in the list_item.xml layout with the place_description text
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_description);
          // Get the version number from the current Place object and set this text on the number TextView
        placeDescription.setText(currentPlace.getPlaceDescription());

        // Find the TextView in the list_item.xml layout with the place_address text
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.place_address);
        // Get the version number from the current AndroidFlavor object and set this text on the number TextView
        placeAddress.setText(currentPlace.getPlaceAddress());

        // Find the TextView in the list_item.xml layout with the place_address text
        TextView placeWebsite = (TextView) listItemView.findViewById(R.id.place_website);
        // Get the version number from the current AndroidFlavor object and set this text on the number TextView
        placeWebsite.setText(currentPlace.getPlaceWebsite());

        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            // Get the version name from the current AndroidFlavor object and set this text on the name TextView
            placeImageView.setImageResource(currentPlace.getPlaceResourceID());
            // Make sure the view is visible
            placeImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            placeImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

