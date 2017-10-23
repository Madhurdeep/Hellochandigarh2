package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity41 extends AppCompatActivity {

        private static ListView list_view;
        private static String[] cars = {"1. Sindhi Sweets","2. Gopals","3.Food Court(elante)","4. NIk Bakers","5. Shree Ratnam","6. Subway","7. Dominos","8.KFC","9. Pal Dhaba"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_41);
        ListView();
    }


    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listView2);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,R.layout.layout1,cars);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0:
                        Intent nextActivity = new Intent(Activity41.this,Activity411.class);
                        startActivity(nextActivity);
                        break;
                    case 1:
                        Intent nextActivity1 = new Intent(Activity41.this,Activity412.class);
                        startActivity(nextActivity1);

                        break;
                    case 2:
                        Intent nextActivity2 = new Intent(Activity41.this,Activity413.class);
                        startActivity(nextActivity2);

                        break;

                    case 3:
                        Intent nextActivity3 = new Intent(Activity41.this,Activity414.class);
                        startActivity(nextActivity3);

                        break;

                    case 4:
                        Intent nextActivity4 = new Intent(Activity41.this,Activity415.class);
                        startActivity(nextActivity4);

                        break;
                    case 5:
                        Intent nextActivity5 = new Intent(Activity41.this,Activity416.class);
                        startActivity(nextActivity5);

                        break;
                    case 6:
                        Intent nextActivity6 = new Intent(Activity41.this,Activity417.class);
                        startActivity(nextActivity6);

                        break;
                    case 7:
                        Intent nextActivity7 = new Intent(Activity41.this,Activity418.class);
                        startActivity(nextActivity7);

                        break;
                    case 8:
                        Intent nextActivity8 = new Intent(Activity41.this,Activity419.class);
                        startActivity(nextActivity8);

                        break;

                    default:
                        break;
                }
            }
        });
    }
}
