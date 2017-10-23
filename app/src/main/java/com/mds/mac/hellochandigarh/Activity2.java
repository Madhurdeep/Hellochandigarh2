package com.mds.mac.hellochandigarh;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class
Activity2 extends Activity {

    private static ListView list_view;
    private static String[] cars = {" 1. JW Mariott"," 2.Hotel MountView"," 3.Hotel Taj"," 4 Shivalik View"," 5.The Lalit"," 6.Hotel Park Plaza"," 7.Hotel Sunbeam"," 8. Western Court"," 9.Hotel Aroma"};

    public Button buttonvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ListView();
        one();
    }

    public void one()
    {
        buttonvar = (Button) findViewById(R.id.button1);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent maps = new Intent(Activity2.this,MapsActivity53.class);
                startActivity(maps);

            }

        });
    }



    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.list);
        ArrayAdapter<String>adapter
                = new ArrayAdapter<String>(this,R.layout.layout1,cars);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              switch(position)
              {
                  case 0:
                      Intent nextActivity = new Intent(Activity2.this,Activity3.class);
                      startActivity(nextActivity);
                      break;
                  case 1:
                      Intent nextActivity1 = new Intent(Activity2.this,Activity4.class);
                      startActivity(nextActivity1);

                      break;
                  case 2:
                      Intent nextActivity2 = new Intent(Activity2.this,Activity5.class);
                      startActivity(nextActivity2);

                      break;

                  case 3:
                      Intent nextActivity3 = new Intent(Activity2.this,Activity6.class);
                      startActivity(nextActivity3);

                      break;

                  case 4:
                      Intent nextActivity4 = new Intent(Activity2.this,Activity7.class);
                      startActivity(nextActivity4);

                      break;
                  case 5:
                      Intent nextActivity5 = new Intent(Activity2.this,Activity8.class);
                      startActivity(nextActivity5);

                      break;
                  case 6:
                      Intent nextActivity6 = new Intent(Activity2.this,Activity9.class);
                      startActivity(nextActivity6);

                      break;
                  case 7:
                      Intent nextActivity7 = new Intent(Activity2.this,Activity10.class);
                      startActivity(nextActivity7);

                      break;
                  case 8:
                      Intent nextActivity8 = new Intent(Activity2.this,Activity11.class);
                      startActivity(nextActivity8);

                      break;

                  default:
                      break;
              }
            }
        });
    }

}
