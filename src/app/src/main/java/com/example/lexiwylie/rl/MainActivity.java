package com.example.lexiwylie.rl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity
{
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        //Firebase currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);

        ImageButton newEntryButton = findViewById(R.id.iconNew);

        newEntryButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent1 = new Intent(MainActivity.this, NewEntry.class);
                startActivity(intent1);
            }
        });

        ImageButton settingsButton = findViewById(R.id.iconSettings);

        settingsButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent2);
            }
        });

        ImageButton mountainEntry = findViewById(R.id.mountainEntry);

        mountainEntry.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent2 = new Intent(MainActivity.this, Entry.class);
                startActivity(intent2);
            }
        });
    }


}
