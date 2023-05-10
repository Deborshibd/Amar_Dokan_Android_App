package com.example.itemsaleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    private Button bus;
    private Button imageView3;
    private Button bus1;
    private Button train;
    private Button cycle;
    private Button airplane;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

     bus = findViewById(R.id.bus);

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Home.this, Inventory.class);
                startActivity(categoryIntent);
            }

        });


        imageView3 = findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Home.this, Shop.class);
                startActivity(categoryIntent);
            }

        });



        bus1 = findViewById(R.id.bus1);

        bus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Home.this, News.class);
                startActivity(categoryIntent);
            }

        });


        train = findViewById(R.id.train);

        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Home.this, MainActivity.class);
                startActivity(categoryIntent);
            }

        });


        cycle = findViewById(R.id.cycle);

        cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Home.this, About_US.class);
                startActivity(categoryIntent);
            }

        });


        airplane = findViewById(R.id.airplane);

        airplane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Home.this, More_Apps.class);
                startActivity(categoryIntent);
            }

        });


    }
}
