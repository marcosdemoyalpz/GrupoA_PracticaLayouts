package com.mdemoya.layouts.grupoa_practicalayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.myListView);

        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            stringList.add(Integer.toString(i));
        }
        listView.setAdapter(new ArrayAdapter(this,
                R.layout.my_text_view,
                stringList));
    }
}
