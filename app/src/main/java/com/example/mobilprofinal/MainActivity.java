package com.example.mobilprofinal;

import android.app.ActionBar;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        SearchView sv = findViewById(R.id.searchView);
        sv.setQueryHint("Cauta o reteta...");

        BottomNavigationView bottomNav= findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch(menuItem.getItemId()){

                        case R.id.meniuri:
                            selectedFragment = new MeniuriFragment();
                            break;

                        case R.id.cont:
                            selectedFragment = new ContFragment();
                            break;

                        case R.id.track:
                            selectedFragment = new TrackFragment();
                            break;


                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment,
                            selectedFragment).commit();

                    return true;
                }
            };
}
