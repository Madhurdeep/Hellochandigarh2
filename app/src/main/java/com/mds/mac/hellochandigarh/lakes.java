package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lakes extends AppCompatActivity {


    private static ListView list_view;
    private static String[] cars = new String[]{" 1. Sukhna Lake", " 2.New Lake"};

    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listl);  ArrayAdapter<String> adapter
            = new ArrayAdapter<String>(this,R.layout.layout1,cars);  list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {  @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch(position)
            {
                case 0:
                    Intent nextActivity1 = new Intent(lakes.this,sukhnaactivity.class);
                    startActivity(nextActivity1);
                    break;  case 1:
                Intent nextActivity2 = new Intent(lakes.this,newlakeactivity.class);
                startActivity(nextActivity2);  break;
                default:  break;

            }
        }  }
     );}

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);
    ListView();
    }
}
