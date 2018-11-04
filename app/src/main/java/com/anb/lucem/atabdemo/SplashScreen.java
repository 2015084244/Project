package com.anb.lucem.atabdemo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);
    }
}

class Event extends Fragment {


    public Event() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event, container, false);
        // Inflate the layout for this fragment
        String[] awayStrings = {
                "Event1",
                "Event2",
                "Event3",
                "Event4",
                "Event5",
                "Event6"
        };

        ListView lv = (ListView) view.findViewById(R.id.listView3);

        ArrayAdapter<String> lva = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, awayStrings);
        lv.setAdapter(lva);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), SplashScreen.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), SplashScreen.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), SplashScreen.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), SplashScreen.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), SplashScreen.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), SplashScreen.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        final SwipeRefreshLayout mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.event);

        mSwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        ((MainActivity) getActivity()).refreshNow();
                        Toast.makeText(getContext(), "Refreshing", Toast.LENGTH_LONG).show();
                    }
                }
        );

        return view;
    }
}

