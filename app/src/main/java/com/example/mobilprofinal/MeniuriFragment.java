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


public class MeniuriFragment extends Fragment {

    ImageView iv;
    static Fragment back2=new MeniuriFragment();
   Fragment muscle = new MeniuMuscleFragment();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.meniuri_fragment,container,false);


        iv=(ImageView) view.findViewById(R.id.meniuMuscle);

        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment,
                        muscle).commit();


                return true;
            }
        });



        return view;





    }
}
