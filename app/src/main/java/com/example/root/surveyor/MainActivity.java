package com.example.root.surveyor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends ActionBarActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        Button btnViewProducts = (Button) findViewById(R.id.btnViewProducts);

        // view products click event
        btnViewProducts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching All products Activity
                Intent i = new Intent(getApplicationContext(), AllFormsActivity.class);
                startActivity(i);

            }
        });
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnViewProducts = (Button) findViewById(R.id.btnViewProducts);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        btnViewProducts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching All products Activity
                Intent i = new Intent(getApplicationContext(), AllFormsActivity.class);
                startActivity(i);

            }
        });

    }
/*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
  /*  public static class PlaceholderFragment extends Fragment {

        ArrayAdapter<String> mForecastAdapter;

        public PlaceholderFragment() {


        }

      /*  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {



        }*/
            /*String[] data = {
                    "Farmer Survey                        NEW",
                    "IFC Survey                           yest",
                    "ABC Survey                           Mar 5",
                    "XYZ Survey                           Mar 1",
                    "ABC Survey                           Feb 5",
                    "XYZ Survey                           Feb 1",



            };
            List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));


           /* mForecastAdapter =
                    new ArrayAdapter<String>(
                             getActivity(), // The current context (this activity)
                             R.layout.list_forms, // The name of the layout ID.
                             R.id.list_item_textview, // The ID of the textview to populate.
                             weekForecast);
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ListView listView = (ListView) rootView.findViewById(R.id.list_forms);
            listView.setAdapter(mForecastAdapter);*/
        // return rootView;


    }
    }