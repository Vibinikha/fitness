package com.example.fitness;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag3, container, false);
        TextView textViewNutrition = view.findViewById(R.id.textViewNutrition);
        TextView textViewTip1 = view.findViewById(R.id.textViewTip1);
        TextView textViewTip2 = view.findViewById(R.id.textViewTip2);
        TextView textViewTip3 = view.findViewById(R.id.textViewTip3);
        TextView textViewTip4 = view.findViewById(R.id.textViewTip4);
        TextView textViewTip5 = view.findViewById(R.id.textViewTip5);

        // Sample data
        textViewNutrition.setText("Nutrition Tips");
        textViewTip1.setText("Eat lean protein with every meal");
        textViewTip2.setText("Include healthy fats like nuts and avocado");
        textViewTip3.setText("Drink plenty of water throughout the day");
        textViewTip4.setText("Eat fiber-rich foods like fruits and vegetables");
        textViewTip5.setText("Limit processed foods and added sugars");

        return view;
    }
}

