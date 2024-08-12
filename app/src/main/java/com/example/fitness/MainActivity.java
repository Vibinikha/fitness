package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome to Fitness World!",Toast.LENGTH_SHORT).show();
                EditText edit=(EditText) findViewById(R.id.editTextText);
                String name=edit.getText().toString();
                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("key",name);
                startActivity(intent);
            }
        });

    }
}