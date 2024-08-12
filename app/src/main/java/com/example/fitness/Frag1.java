package com.example.fitness;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;


public class Frag1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);
        TextView textViewWOD = view.findViewById(R.id.textViewWOD);
        TextView textViewExercise1 = view.findViewById(R.id.textViewExercise1);
        TextView textViewSets1 = view.findViewById(R.id.textViewSets1);
        TextView textViewReps1 = view.findViewById(R.id.textViewReps1);
        TextView textViewExercise2 = view.findViewById(R.id.textViewExercise2);
        TextView textViewSets2 = view.findViewById(R.id.textViewSets2);
        TextView textViewReps2 = view.findViewById(R.id.textViewReps2);
        TextView textViewExercise3 = view.findViewById(R.id.textViewExercise3);
        TextView textViewSets3 = view.findViewById(R.id.textViewSets3);
        TextView textViewReps3 = view.findViewById(R.id.textViewReps3);
        TextView textViewExercise4 = view.findViewById(R.id.textViewExercise4);
        TextView textViewSets4 = view.findViewById(R.id.textViewSets4);
        TextView textViewReps4 = view.findViewById(R.id.textViewReps4);

        // Test data
        textViewWOD.setText("Workout of the Day");
        textViewExercise1.setText("Squats");
        textViewSets1.setText("3 sets");
        textViewReps1.setText("12 reps");
        textViewExercise2.setText("Push-ups");
        textViewSets2.setText("3 sets");
        textViewReps2.setText("15 reps");
        textViewExercise3.setText("Lunges");
        textViewSets3.setText("3 sets");
        textViewReps3.setText("12 reps");
        textViewExercise4.setText("Deadlifts");
        textViewSets4.setText("3 sets");
        textViewReps4.setText("10 reps");

        return view;
    }
}

