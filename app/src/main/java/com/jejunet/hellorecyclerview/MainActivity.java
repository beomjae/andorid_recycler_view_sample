package com.jejunet.hellorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    private void initview() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Recycler_item> items = new ArrayList<>();
        Recycler_item[] item = new Recycler_item[5];
        item[0] = new Recycler_item(R.drawable.ice_skate, "#1");
        item[1] = new Recycler_item(R.drawable.car, "#2");
        item[2] = new Recycler_item(R.drawable.ice_skate, "#3");
        item[3] = new Recycler_item(R.drawable.car, "#4");
        item[4] = new Recycler_item(R.drawable.ice_skate, "#5");
        for(int i=0; i<5; i++) {
            items.add(item[i]);
        }

        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(), items, R.layout.activity_main));
    }
}
