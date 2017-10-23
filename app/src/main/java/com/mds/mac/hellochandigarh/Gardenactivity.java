package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Gardenactivity extends AppCompatActivity {

    private static ListView list_view;
    private static String[]cars=new String[]{"1. Rock Garden","2. Cactus Garden","3. Zakir Hussain Rose Garden","4. Garden Of Fragrance"};


    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listg);  ArrayAdapter<String> adapter
            = new ArrayAdapter<String>(this,R.layout.layout1,cars);  list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {  @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch(position)
            {
                case 0:
                    Intent nextActivity1 = new Intent(Gardenactivity.this,rockactivity.class);
                    startActivity(nextActivity1);
                    break;  case 1:
                Intent nextActivity2 = new Intent(Gardenactivity.this,cactusactivity.class);
                startActivity(nextActivity2);
                break;  case 2:
                Intent nextActivity3 = new Intent(Gardenactivity.this,roseactivity.class);

                startActivity(nextActivity3);  break;
                case 3:
                    Intent nextActivity4 = new
                            Intent(Gardenactivity.this,fragranceactivity.class);  startActivity(nextActivity4);
                    break;
                default:  break;

            }
        }  } );}

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardenactivity);
    ListView();
    }
        }
