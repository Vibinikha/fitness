package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button b1 = findViewById(R.id.button4);
        Button b2 = findViewById(R.id.button5);
        Button b3 = findViewById(R.id.button6);
        Intent intent = getIntent();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, Frag1.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, Frag2.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, Frag3.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();

            }
        });
    }
}
