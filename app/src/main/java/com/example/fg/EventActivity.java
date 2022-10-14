package com.example.fg;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        String[] event = {"Футбольный матч: Бавария - ПСЖ 21:30 ", "Концерт: Playboi Carti concert 23:30", "Фильм: Интерстеллар 17:45","\n" +
                "Баскетбольный матч:Бостон Селтикс - Филадельфия Сиксер 2:30", "Балет: Лебединое озеро 18:30", "Хоккейный матч: Питтсбург - Аризона 4:30"};
            ListView lvMain = (ListView)findViewById(R.id.lv);
            final TextView txt1 = (TextView)findViewById(R.id.txt1);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,event);
            lvMain.setAdapter(adapter);
            lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    txt1.setText(event[position]);
                }
            });
}}
