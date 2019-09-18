package com.example.mobilprofinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class InstructiuniPenne extends Fragment {

    ImageView iv;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.instructiuni_pennesicilienealforno,container,false);

    iv=view.findViewById(R.id.backToMeniuMuscle);

    iv.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment,
                    MeniuMuscleFragment.backToReteteMuscle).commit();

            return false;
        }
    });





        return view;





    }
}
