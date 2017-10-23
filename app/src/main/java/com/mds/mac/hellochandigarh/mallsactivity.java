package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mallsactivity extends AppCompatActivity {

    private static ListView list_view;
    private static String[] cars = new String[]{" 1. Elante Mall", " 2.Sham Fashion Mall", " 3.Piccadily Square Mall"};


    public void ListView()
    {
        list_view = (ListView)findViewById(R.id.listmall);  ArrayAdapter<String> adapter
            = new ArrayAdapter<String>(this,R.layout.layout1,cars);  list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {  @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch(position)
            {
                case 0:
                    Intent nextActivity1 = new Intent(mallsactivity.this,elanteactivity.class);
                    startActivity(nextActivity1);
                    break;  case 1:
                Intent nextActivity2 = new Intent(mallsactivity.this,shamactivity.class);
                startActivity(nextActivity2);
                break;  case 2:
                Intent nextActivity3 = new Intent(mallsactivity.this,piccadilyactivity.class);
                startActivity(nextActivity3);  break;
                default:  break;


            }
        }  }
     );}



@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mallsactivity);
    ListView();
    }
}
