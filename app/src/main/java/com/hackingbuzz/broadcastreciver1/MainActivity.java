package com.hackingbuzz.broadcastreciver1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Boradcast messages will work.. even after...we close the application...its not a application (project) level messages
    // its system level...once i create a application with broadcast recivers( reicieve ) method...it will work for whole system
    // if any application is open or no application is open it still give u message...like batter low...charger connected..
    //it doesnt care what you doing on  your system...it will show global msg untill you uninstall the application.
}
