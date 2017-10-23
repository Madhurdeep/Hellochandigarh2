package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity6 extends AppCompatActivity {


    public ImageButton buttonvar;


    public void one()
    {
        buttonvar = (ImageButton)findViewById(R.id.ib3);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(Activity6.this,MapsActivity14.class);
                startActivity(hotel);

            }

        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        one();
    }
}
