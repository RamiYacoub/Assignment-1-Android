package com.example.ass1final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("barcelona vs real madrid 12-12-2021 07:00pm");
        spinnerArray.add("dortmund vs psg 13-12-2021 08:00pm");
        spinnerArray.add("juventus vs chelsea 14-12-2021 09:00pm");
        spinnerArray.add("inter milan vs ac milan 15-12-2021 10:00pm");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner2);
        sItems.setAdapter(adapter);

        Button button2 =(Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        Button button =(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Reserve successfully";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();
            }

        });

    }

}