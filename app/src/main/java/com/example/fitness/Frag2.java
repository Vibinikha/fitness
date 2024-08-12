package com.example.fitness;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Frag2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);
        TextView textViewProgress = view.findViewById(R.id.textViewProgress);
        TextView textViewWeight = view.findViewById(R.id.textViewWeight);
        TextView textViewWeightValue = view.findViewById(R.id.textViewWeightValue);
        TextView textViewBodyFat = view.findViewById(R.id.textViewBodyFat);
        TextView textViewBodyFatValue = view.findViewById(R.id.textViewBodyFatValue);
        TextView textViewMuscleMass = view.findViewById(R.id.textViewMuscleMass);
        TextView textViewMuscleMassValue = view.findViewById(R.id.textViewMuscleMassValue);

        // Sample data
        textViewProgress.setText("Progress Tracking");
        textViewWeight.setText("Weight");
        textViewWeightValue.setText("70kg");
        textViewBodyFat.setText("Body Fat %");
        textViewBodyFatValue.setText("20%");
        textViewMuscleMass.setText("Muscle Mass");
        textViewMuscleMassValue.setText("40kg");

        return view;
    }
}