package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity51 extends AppCompatActivity {



    private static ListView list_view;
    private static String[] cars = {"1. Elante Mall","2. North Country Mall","3. Paras DownTown Square","4. Sector 17"};



    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listshop);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,R.layout.layout1,cars);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0:
                        Intent nextActivity = new Intent(Activity51.this,Activity511.class);
                        startActivity(nextActivity);
                        break;
                    case 1:
                        Intent nextActivity1 = new Intent(Activity51.this,Activity512.class);
                        startActivity(nextActivity1);

                        break;
                    case 2:
                        Intent nextActivity2 = new Intent(Activity51.this,Activity513.class);
                        startActivity(nextActivity2);

                        break;

                    case 3:
                        Intent nextActivity3 = new Intent(Activity51.this,Activity514.class);
                        startActivity(nextActivity3);

                        break;

                    default:
                        break;
                }
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_51);
        ListView();
    }
}
