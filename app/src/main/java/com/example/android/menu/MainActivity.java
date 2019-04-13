package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView mango = (TextView) findViewById(R.id.menu_item_1);
        TextView pie = (TextView) findViewById(R.id.menu_item_2);
        TextView cake = (TextView) findViewById(R.id.menu_item_3);
        String menu_item_1 = mango.getText().toString();
        String menu_item_2 = pie.getText().toString();
        String menu_item_3 = cake.getText().toString();
        Log.v("MainActivity", menu_item_1);
        Log.v("MainActivity", menu_item_2);
        Log.v("MainActivity", menu_item_3);
    }
}