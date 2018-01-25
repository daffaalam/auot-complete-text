package com.daffaalam.example.autocomplete;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class main extends AppCompatActivity {

    String[] nama = {
            "Jakarta Selatan",
            "Jakarta Barat",
            "Jakarta Timur",
            "Jakarta Utara",
            "Jakarta Pusat",
            "Tangerang Kota",
            "Tangerang Kabupaten",
            "Tangerang Selatan",
            "Bekasi Barat",
            "Bekasi Selatan",
            "Bekasi Timur",
            "Bekasi Utara",
            "Bogor",
            "Depok",
            "Bandung"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView nmakt = (AutoCompleteTextView) findViewById(R.id.autotext);
        ArrayAdapter<String> nmkta;
        nmkta = new ArrayAdapter<>(main.this, android.R.layout.simple_list_item_1, nama);

        nmakt.setThreshold(1);
        nmakt.setAdapter(nmkta);
    }
}
