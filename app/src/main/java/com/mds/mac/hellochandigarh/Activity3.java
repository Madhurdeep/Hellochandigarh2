package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity3 extends AppCompatActivity {


    public ImageButton buttonvar;
    public ImageButton b;


    public void one()
    {
        buttonvar = (ImageButton)findViewById(R.id.ib);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(Activity3.this,MapsActivity11.class);
                startActivity(hotel);

            }

        });
    }



    public void two(View view)
    {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.marriott.com/hotels/hotel-rooms/ixcjw-jw-marriott-hotel-chandigarh/"));
        startActivity(browser);
    }

    public void three(View view)
    {
        Intent openapp = getPackageManager().getLaunchIntentForPackage("com.ubercab");
        startActivity(openapp);

    }

    public void four(View view)
    {
        Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfWK3Em3GoevZRrtMEQNJfEfnd_OxtB9dVTJwCT_Td2_nHeXA/viewform?usp=sf_link"));
        startActivity(browser1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        one();

        b = (ImageButton)findViewById(R.id.imageButton12);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent (Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:7087396177"));
                startActivity(call);
            }
        });

    }
}
