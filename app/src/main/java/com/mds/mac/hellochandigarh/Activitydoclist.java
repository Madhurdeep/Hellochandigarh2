package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activitydoclist extends AppCompatActivity {

    private static ListView list_view;
    private static String[] cars = {"1. Physician","2. Cardiologist","3. Dermatologist","4. Ophthalmologist","5. Neurologist","6. ENT Specialist","7. Orthopedician","8.Child Specialist","9. Surgeon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydoclist);
        ListView();
    }

    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,R.layout.layout1,cars);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0:
                        Intent nextActivity = new Intent(Activitydoclist.this,Doc1.class);
                        startActivity(nextActivity);
                        break;
                    case 1:
                        Intent nextActivity1 = new Intent(Activitydoclist.this,doc2.class);
                        startActivity(nextActivity1);

                        break;
                    case 2:
                        Intent nextActivity2 = new Intent(Activitydoclist.this,doc3.class);
                        startActivity(nextActivity2);

                        break;

                    case 3:
                        Intent nextActivity3 = new Intent(Activitydoclist.this,doc4.class);
                        startActivity(nextActivity3);

                        break;

                    case 4:
                        Intent nextActivity4 = new Intent(Activitydoclist.this,doc5.class);
                        startActivity(nextActivity4);

                        break;
                    case 5:
                        Intent nextActivity5 = new Intent(Activitydoclist.this,doc6.class);
                        startActivity(nextActivity5);

                        break;
                    case 6:
                        Intent nextActivity6 = new Intent(Activitydoclist.this,doc7.class);
                        startActivity(nextActivity6);

                        break;
                    case 7:
                        Intent nextActivity7 = new Intent(Activitydoclist.this,doc8.class);
                        startActivity(nextActivity7);

                        break;
                    case 8:
                        Intent nextActivity8 = new Intent(Activitydoclist.this,doc9.class);
                        startActivity(nextActivity8);

                        break;

                    default:
                        break;
                }
            }
        });
    }

}



