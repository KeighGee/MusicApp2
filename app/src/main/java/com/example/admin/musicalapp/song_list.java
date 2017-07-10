package com.example.admin.musicalapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class song_list extends AppCompatActivity {

    ListView listView;

    List<String> list;

    ListAdapter adapter;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        listView = (ListView) findViewById(R.id.R.layout);

        list = new ArrayList<>();

        Field[] fields = R.raw.class.getFields();
        for (int i = 0; i < fields.length; i++) {
            list.add(fields[i].getName());
        }
        //remove first two elements
        list.remove(0);
        list.remove(0);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            if (mediaPlayer != null){
                mediaPlayer.start();
            }

            int resID = getResources().getIdentifier(list.get(i),"raw", getPackageName());
                mediaPlayer = MediaPlayer.create(song_list.this, resID);
                mediaPlayer.start();
            }
        });
    }
}