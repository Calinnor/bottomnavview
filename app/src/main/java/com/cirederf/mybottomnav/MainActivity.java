package com.cirederf.mybottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private TextView tvContenName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavigationView=findViewById(R.id.bottom_navigation);
        tvContenName=findViewById(R.id.content_name);
        this.configurebottomview();
    }

    private void configurebottomview(){
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        tvContenName.setText(R.string.tv_str_content_home);
                        return true;
                    case R.id.chat:
                        tvContenName.setText(R.string.tv_str_content_chat);
                        return true;
                    case R.id.profil:
                        tvContenName.setText(R.string.menu_str_profil);
                        return true;
                }
                return false;
            }
        });
    }
}