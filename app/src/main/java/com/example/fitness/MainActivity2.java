package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView view = (TextView) findViewById(R.id.textView2);
        EditText view2 = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        EditText view1 = (EditText) findViewById(R.id.editTextTextPassword2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("key");
        view.setText(str);
        Button b1 = findViewById(R.id.button3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Do you want to continue").setTitle("Dialog box").setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                                Toast.makeText(getApplicationContext(), "enjoy login ",
                                        Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                Toast.makeText(getApplicationContext(), "CHECK THE DETAILS",
                                        Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Alert box");
                alert.show();
            }

        });
    }
}