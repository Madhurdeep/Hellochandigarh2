package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class multiplexes extends AppCompatActivity {


    private static ListView list_view;
    private static String[] cars = new String[]{" 1. Fun City", " 2. Sector 17"};

    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listo);  ArrayAdapter<String> adapter
            = new ArrayAdapter<String>(this,R.layout.layout1,cars);  list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {  @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch(position)
            {
                case 0:
                    Intent nextActivity1 = new Intent(multiplexes.this,funcityactivity.class);
                    startActivity(nextActivity1);
                    break;  case 1:
                Intent nextActivity2 = new Intent(multiplexes.this,sectoractivity.class);
                startActivity(nextActivity2);  break;
                default:  break;

            }
        }  }
    );}

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplexes);
    ListView();
    }
}
