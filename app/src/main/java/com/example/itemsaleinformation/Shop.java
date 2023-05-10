package com.example.itemsaleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop extends AppCompatActivity {


    private Button bus;
    private Button imageView3;
    private Button bus1;
    private Button train;
    private Button cycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);


        bus = findViewById(R.id.bus);

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Shop.this, Interior.class);
                startActivity(categoryIntent);
            }

        });


        imageView3 = findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Shop.this, Ecom_Tips.class);
                startActivity(categoryIntent);
            }

        });



        bus1 = findViewById(R.id.bus1);

        bus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Shop.this, Business_Guru.class);
                startActivity(categoryIntent);
            }

        });


        Button train = findViewById(R.id.train);

        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Shop.this, Laws.class);
                startActivity(categoryIntent);
            }

        });


        bus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Shop.this, Business_Guru.class);
                startActivity(categoryIntent);
            }

        });



        Button cycle = findViewById(R.id.cycle);

        cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Shop.this, Updates.class);
                startActivity(categoryIntent);
            }

        });






    }
}
