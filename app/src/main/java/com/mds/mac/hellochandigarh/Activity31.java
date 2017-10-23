package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity31 extends AppCompatActivity {

    public ImageButton buttonvar1;
    public void gym()
    {
        buttonvar1 = (ImageButton)findViewById(R.id.imageButton9);
        buttonvar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(Activity31.this,Gymdata.class);
                startActivity(hotel);

            }

        });
    }
    public void doc()
    {
        buttonvar1 = (ImageButton)findViewById(R.id.imageButton10);
        buttonvar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(Activity31.this,Activitydoclist.class);
                startActivity(hotel);

            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_31);
        gym();
        doc();
    }
}
