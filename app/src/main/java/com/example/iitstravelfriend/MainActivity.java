package com.example.iitstravelfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
// This class is made for main page that will be view after register or login is successful
public class MainActivity extends AppCompatActivity {
    Button Searchbutton1;                   //two buttons are made here for search purposes
    Button Searchbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Searchbutton1 = findViewById(R.id.searchbutton1); //calling the buttons from layout
        Searchbutton2 = findViewById(R.id.searchbutton2);
        //Define the condition for user when they choose the first option or another
        //SEtonclicklistener is used for this purpose
        Searchbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),listofiits.class));        //startactivity is used to jump to other page(there , it is redirected to listofiitss page
            }
        });
        Searchbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),listofstates.class));
            }
        });
    }


    public void givefeedback(View view) {
        startActivity(new Intent(getApplicationContext(), feedbackform.class));
        finish();
    }
}