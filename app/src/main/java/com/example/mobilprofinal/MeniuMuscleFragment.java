package com.example.mobilprofinal;


import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MeniuMuscleFragment extends Fragment {
    ImageView iv2;
    ImageView penne;
    Fragment instructiuniPenne= new InstructiuniPenne();
    static Fragment backToReteteMuscle = new MeniuMuscleFragment();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.meniumuscle_fragment,container,false);
        penne=(ImageView) view.findViewById(R.id.penneSicilieneAlForno);
        iv2=(ImageView) view.findViewById(R.id.backToMeniuMuscle);

        iv2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment,
                        MeniuriFragment.back2).commit();


                return false;
            }
        });

        penne.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment,
                        instructiuniPenne).commit();


                return true;
            }
        });



        return view;
    }
}
