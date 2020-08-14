package org.example.joeysparidaans.samplemaps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(v -> startNavigation());
    }

    private void startNavigation() {
        //See images folder for screenshot on my Samsung Galaxy Note 10+
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Gartenstrasse 33+41372+Niederkruechten");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}