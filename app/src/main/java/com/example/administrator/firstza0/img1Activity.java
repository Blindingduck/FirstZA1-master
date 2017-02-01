package com.example.administrator.firstza0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class img1Activity extends AppCompatActivity {
    Button btn_Map;
    TextView tv_Place,tv_History,tv_Location,tv_Transition,tv_Cost,tv_Day;
    String place,history,location,transition,cost,day;
    double lat=0,lng=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img1);
        tv_Place = (TextView) findViewById(R.id.tvPlace);
        tv_History = (TextView) findViewById(R.id.tvHistory);
        tv_Location = (TextView) findViewById(R.id.tvLocation);
        tv_Transition = (TextView) findViewById(R.id.tvTransition);
        tv_Cost = (TextView) findViewById(R.id.tvCost);
        tv_Day = (TextView) findViewById(R.id.tvDay);
        btn_Map = (Button) findViewById(R.id.btnMap);

        Intent Data = getIntent();
        place = Data.getStringExtra("Place");
        lat = Data.getDoubleExtra("Lat",lat);
        lng = Data.getDoubleExtra("Lng",lng);
        history = Data.getStringExtra("History");
        location = Data.getStringExtra("Location");
        transition = Data.getStringExtra("Transition");
        cost = Data.getStringExtra("Cost");
        day = Data.getStringExtra("Day");

        tv_Place.setText(place);
        tv_History.setText(history);
        tv_Location.setText(location);
        tv_Transition.setText(transition);
        tv_Cost.setText(cost);
        tv_Day.setText(day);

        btn_Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(img1Activity.this,MapsActivity.class);
                myIntent.putExtra("Place",place);
                myIntent.putExtra("Lat",lat);
                myIntent.putExtra("Lng",lng);
                startActivity(myIntent);
            }
        });
    }
}
