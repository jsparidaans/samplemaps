package org.example.joeysparidaans.samplemaps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnNavigation, btnGeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNavigation = findViewById(R.id.btnNavigation);
        btnNavigation.setOnClickListener(v -> startNavigation());

        btnGeo = findViewById(R.id.btnGeo);
        btnGeo.setOnClickListener(v -> startGeoMaps());
    }

    private void startNavigation() {
        //See images folder for screenshot on my Samsung Galaxy Note 10+
        Uri gmmIntentUri = new Uri.Builder()
                .scheme("google.navigation")
                .path("0,0")
                //Note that this is the only address we found discrepancies in results, other addresses have worked as intended so far
                .appendQueryParameter("q", "Gartenstrasse 33+41372+Niederkruechten")
                .build();
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    private void startGeoMaps() {
        //See images folder for screenshot on my Samsung Galaxy Note 10+
        Uri gmmIntentUri = new Uri.Builder()
                .scheme("geo")
                .path("0,0")
                .appendQueryParameter("q", "Gartenstrasse 33+41372+Niederkruechten")
                .build();
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}