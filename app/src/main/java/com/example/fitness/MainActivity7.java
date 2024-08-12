package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    Integer[] imageIDs={
            R.drawable.lgimg1,
            R.drawable.lgimg2,
            R.drawable.img,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        GridView gridView=(GridView)this.findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                Toast.makeText(getBaseContext(), "Enjoy workouting", Toast.LENGTH_SHORT).show();
            }
        });
        Button b4=(Button) findViewById(R.id.button8);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(i);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter
    {
        private Context context;
        public ImageAdapter (Context c)
        {
            context =c;
        }
        public int getCount()
        {
            return imageIDs.length;
        }
        public Object getItem(int position)
        {
            return position;
        }
        public long getItemId(int position)
        {
            return position;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            ImageView imageView;
            if (convertView == null)
            {
                imageView = new ImageView(context);
                imageView.setLayoutParams (new GridView.LayoutParams (550, 550));
                imageView.setScaleType ( ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding (90, 90, 90, 90);
            }
            else
            {
                imageView=(ImageView) convertView;
            }
            imageView.setImageResource(imageIDs[position]);
            return imageView;
        }
    }
}
