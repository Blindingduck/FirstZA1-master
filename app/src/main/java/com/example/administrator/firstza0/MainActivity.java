package com.example.administrator.firstza0;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5,img6;
    Intent myIntent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //เยาราข
                myIntent = new Intent(MainActivity.this,img1Activity.class);
                myIntent.putExtra("Place","เยาวราช");
                myIntent.putExtra("Lat",13.739757);
                myIntent.putExtra("Lng",100.510717);
                myIntent.putExtra("History","A");
                myIntent.putExtra("Location","B");
                myIntent.putExtra("Transition","C");
                myIntent.putExtra("Cost","D");
                myIntent.putExtra("Day","E");
                startActivity(myIntent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //สวนจตุจักร
                myIntent = new Intent(MainActivity.this,img1Activity.class);
                myIntent.putExtra("Place","ตลาดนัดสวนจตุจักร");
                myIntent.putExtra("Lat",13.799995);
                myIntent.putExtra("Lng",100.551007);
                myIntent.putExtra("History","AA");
                myIntent.putExtra("Location","BB");
                myIntent.putExtra("Transition","CC");
                myIntent.putExtra("Cost","DD");
                myIntent.putExtra("Day","FF");
                startActivity(myIntent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //สวนจตุจักร
                myIntent = new Intent(MainActivity.this,img1Activity.class);
                myIntent.putExtra("Place","ตลาดนัดสวนจตุจักร");
                myIntent.putExtra("Lat",13.799995);
                myIntent.putExtra("Lng",100.551007);
                myIntent.putExtra("History","AA");
                myIntent.putExtra("Location","BB");
                myIntent.putExtra("Transition","CC");
                myIntent.putExtra("Cost","DD");
                myIntent.putExtra("Day","FF");
                startActivity(myIntent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //สวนจตุจักร
                myIntent = new Intent(MainActivity.this,img1Activity.class);
                myIntent.putExtra("Place","ตลาดนัดสวนจตุจักร");
                myIntent.putExtra("Lat",13.799995);
                myIntent.putExtra("Lng",100.551007);
                myIntent.putExtra("History","AA");
                myIntent.putExtra("Location","BB");
                myIntent.putExtra("Transition","CC");
                myIntent.putExtra("Cost","DD");
                myIntent.putExtra("Day","FF");
                startActivity(myIntent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //สวนจตุจักร
                myIntent = new Intent(MainActivity.this,img1Activity.class);
                myIntent.putExtra("Place","ตลาดนัดสวนจตุจักร");
                myIntent.putExtra("Lat",13.799995);
                myIntent.putExtra("Lng",100.551007);
                myIntent.putExtra("History","AA");
                myIntent.putExtra("Location","BB");
                myIntent.putExtra("Transition","CC");
                myIntent.putExtra("Cost","DD");
                myIntent.putExtra("Day","FF");
                startActivity(myIntent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //สวนจตุจักร
                myIntent = new Intent(MainActivity.this,img1Activity.class);
                myIntent.putExtra("Place","ตลาดนัดสวนจตุจักร");
                myIntent.putExtra("Lat",13.799995);
                myIntent.putExtra("Lng",100.551007);
                myIntent.putExtra("History","AA");
                myIntent.putExtra("Location","BB");
                myIntent.putExtra("Transition","CC");
                myIntent.putExtra("Cost","DD");
                myIntent.putExtra("Day","FF");
                startActivity(myIntent);
            }
        });


    }
}
