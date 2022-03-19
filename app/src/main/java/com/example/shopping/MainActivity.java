package com.example.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import javax.sql.DataSource;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> itemsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items cheese = new Items("cheese",2.5 , R.drawable.cheese);
        Items chocolate = new Items("chocolate",0.5 , R.drawable.chocolate );
        Items coffee = new Items("coffee",1.5 , R.drawable.coffee );
        Items donut = new Items("donut",1.0 , R.drawable.donut );
        Items fries = new Items("fries",1.0 , R.drawable.fries );
        Items honey = new Items("honey",1.0 , R.drawable.honey );

        itemsList.add(cheese);
        itemsList.add(chocolate);
        itemsList.add(coffee);
        itemsList.add(donut);
        itemsList.add(fries);
        itemsList.add(honey);

        ItemsAdapter adapter = new ItemsAdapter(this, 0 , itemsList );
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);



    }
}