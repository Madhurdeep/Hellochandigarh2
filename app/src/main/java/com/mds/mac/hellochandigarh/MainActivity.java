package com.mds.mac.hellochandigarh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    public ImageButton buttonvar;


    public void one()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity2.class);
                startActivity(hotel);

            }

        });
    }

    public void three()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton3);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity31.class);
                startActivity(hotel);


            }

        });
    }

    public void five()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton5);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity51.class);
                startActivity(hotel);


            }

        });
    }
    public void six()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton6);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity61.class);
                startActivity(hotel);


            }

        });
    }

    public void seven()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton7);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity71.class);
                startActivity(hotel);

            }

        });
    }
    public void four()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton4);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity41.class);
                startActivity(hotel);

            }

        });
    }
    public void two()
    {
        buttonvar = (ImageButton)findViewById(R.id.imageButton2);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(MainActivity.this,Activity21.class);
                startActivity(hotel);

            }

        });
    }

    public void eight()
    {

    }




    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        ImageButton mail = (ImageButton) findViewById(R.id.imageButton299);
        mail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                Intent mailI = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "madhurdeep29@gmail.com",null));
                mailI.putExtra(Intent.EXTRA_SUBJECT,"Welcome to Chandigarh Administration");
                mailI.putExtra(Intent.EXTRA_TEXT,"Please enter Query or Feedback");
                startActivity(Intent.createChooser(mailI,"Send Email..."));

            }
        });
            one();
            two();
            three();
            four();
            five();
            six();
            seven();

        }




    }

