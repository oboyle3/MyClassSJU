package com.example.myclasssju;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    //refence to buttons
    Button btn_add, btn_ViewAll;
    EditText et_id,et_age;
    Switch sw_active;
    ListView lv_listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add);
        btn_ViewAll = findViewById(R.id.btn_viewAll);
        et_age = findViewById(R.id.et_age);
        et_id = findViewById(R.id.et_id);
        sw_active = findViewById(R.id.sw_active);
        lv_listView = findViewById(R.id.lv_listView);

        //button listeners
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_ViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });









    }
}