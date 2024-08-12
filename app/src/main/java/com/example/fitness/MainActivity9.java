package com.example.fitness;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity9 extends AppCompatActivity {
    EditText name,contact,dob;
    Button insert,update,delete,view;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);
        name =findViewById(R.id.textView8);
        contact=findViewById(R.id.textView9);
        dob=findViewById(R.id.textView11);
        insert=findViewById(R.id.button9);
        update= findViewById(R.id.button12);
        delete = findViewById(R.id.button13);
        view = findViewById(R.id.button11);
        DB=new DBHelper(this);
        Button b4=(Button) findViewById(R.id.bu);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(i);
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();
                Boolean checkinsertdata = DB.insertuserdata(nameTXT,contactTXT,dobTXT);
                if(checkinsertdata==true){
                    Toast.makeText(MainActivity9.this,"new wntry",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity9.this,"new entery not inserted",Toast.LENGTH_LONG).show();
                }
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT =name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();
                Boolean checkupdatedata = DB.updateuserdata(nameTXT,contactTXT,dobTXT);
                if(checkupdatedata==true)
                {
                    Toast.makeText(getApplicationContext(),"entry updated",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"new ntry not updated",Toast.LENGTH_LONG).show();
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                Boolean checkudeletedata = DB.deletedata(nameTXT);
                if(checkudeletedata==true)
                {
                    Toast.makeText(getApplicationContext(),"entry deleted",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"entry not deleted",Toast.LENGTH_LONG).show();
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = DB.getdata();
                if(res.getCount()==0)
                {
                    Toast.makeText(getApplicationContext(),"no entry exists",Toast.LENGTH_LONG).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("NAME :"+res.getString(0)+"\n");
                    buffer.append("CONTACT :"+res.getString(1)+"\n");
                    buffer.append("DATE OF BIRTH :"+res.getString(2)+"\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity9.this);
                builder.setCancelable(true);
                builder.setTitle("USER ENTRIES :");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });



    }
}