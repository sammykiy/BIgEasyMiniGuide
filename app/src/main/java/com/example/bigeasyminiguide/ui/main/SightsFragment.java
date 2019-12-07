package com.example.bigeasyminiguide.ui.main;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.bigeasyminiguide.R;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of Sights (Places).
 * */
public class SightsFragment  extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                View rootView = inflater.inflate(R.layout.place_list, container, false);

                String varT1 = getString(R.string.sights_1_Title);
                String varD1 = getString(R.string.sights_1_Desc);
                String varA1 = getString(R.string.sights_1_Address);
                String varL1 = getString(R.string.sights_1_Link);

                String varT2 = getString(R.string.sights_2_Title);
                String varD2 = getString(R.string.sights_2_Desc);
                String varA2 = getString(R.string.sights_2_Address);
                String varL2 = getString(R.string.sights_2_Link);

                String varT3 = getString(R.string.sights_3_Title);
                String varD3 = getString(R.string.sights_3_Desc);
                String varA3 = getString(R.string.sights_3_Address);
                String varL3 = getString(R.string.sights_3_Link);

                String varT4 = getString(R.string.sights_4_Title);
                String varD4 = getString(R.string.sights_4_Desc);
                String varA4 = getString(R.string.sights_4_Address);
                String varL4 = getString(R.string.sights_4_Link);

                String varT5 = getString(R.string.sights_5_Title);
                String varD5 = getString(R.string.sights_5_Desc);
                String varA5 = getString(R.string.sights_5_Address);
                String varL5 = getString(R.string.sights_5_Link);

                String varT6 = getString(R.string.sights_6_Title);
                String varD6 = getString(R.string.sights_6_Desc);
                String varA6 = getString(R.string.sights_6_Address);
                String varL6 = getString(R.string.sights_6_Link);
                // Create a list of words
                final ArrayList<Place> places = new ArrayList<Place>();
                        places.add(new Place( varT1, varD1,varA1, varL1));
                        places.add(new Place( varT2,R.drawable.superdome,varD2,varA2, varL2));
                        places.add(new Place( varT3,R.drawable.lakeponchartrain,varD3,varA3, varL3));
                        places.add(new Place( varT4,R.drawable.riverwalk,varD4,varA4, varL4));
                        places.add(new Place( varT5,R.drawable.citypark,varD5,varA5, varL5));
                        places.add(new Place( varT6,R.drawable.stlouiscathedral,varD6,varA6, varL6));

                PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);

                ListView listView = (ListView) rootView.findViewById(R.id.list);

                listView.setAdapter(adapter);

                return rootView;
        }
}
