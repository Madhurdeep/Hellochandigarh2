package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity21 extends AppCompatActivity {

    private static ListView list_view;
    private static String[] cars = new String[]{" 1. Gardens", " 2.Malls", " 3.Lakes", " 4 Others"};
    public void ListView()  {
        list_view = (ListView)findViewById(R.id.listm);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,R.layout.layout1,cars);  list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        Intent nextActivity1 = new Intent(Activity21.this,Gardenactivity.class);  startActivity(nextActivity1);
                        break;  case 1:
                    Intent nextActivity2 = new Intent(Activity21.this,mallsactivity.class);

                    startActivity(nextActivity2);  break;
                    case 2:
                        Intent nextActivity3 = new Intent(Activity21.this,lakes.class);  startActivity(nextActivity3);
                        break;
                    case 3:
                        Intent nextActivity4 = new
                                Intent(Activity21.this,multiplexes.class);  startActivity(nextActivity4);


                    default:  break;
                }
            }  });  }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);
        ListView();
    }
}
