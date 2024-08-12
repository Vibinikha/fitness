package com.example.fitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    private Button contextbt,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contextbt = findViewById(R.id.button);
        registerForContextMenu(contextbt);
        b1=(Button) findViewById(R.id.button10);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.menuProfile) {
            Intent a = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(a);
        }
        if (itemId == R.id.menuSettings) {
            Toast.makeText(this, "Logging in into Settings", Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuMoreOptions) {
            Toast.makeText(this, "Giving More Options", Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuHistory) {
            Toast.makeText(this, "Workout History", Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuAppCare) {
            Toast.makeText(this, "Appcare", Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuExit) {
            Toast.makeText(this, "Exiting", Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuDevices) {
            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuLogout) {
            Toast.makeText(this, "Logging Out", Toast.LENGTH_SHORT).show();

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.option, menu);

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "enter to Week 1", Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}