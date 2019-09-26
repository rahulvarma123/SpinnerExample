package com.example.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //implements AdapterView.OnItemSelectedListener {
    //Spinner spinner;
    AutoCompleteTextView actv;
    //TextView txtview;
    //String[] countries = {"India", "Bangladesh", "Srilanka", "Australia", "Russia"};
    String[] names = {"akash", "akshith", "akshita", "akshar", "akshara", "anirudh"};
    //ArrayAdapter countryadapter;
    ArrayAdapter namesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //spinner = findViewById(R.id.spinner);
        actv = findViewById(R.id.autoctv);
        actv.setThreshold(3);

        //txtview = findViewById(R.id.Textview);
        namesAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, names);
        actv.setAdapter(namesAdapter);

        //countryadapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries);
       /* spinner.setAdapter(countryadapter);
        spinner.setOnItemSelectedListener(this);*/

    }

   /* @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String str = countries[position];
        txtview.setText(str);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }*/
}
