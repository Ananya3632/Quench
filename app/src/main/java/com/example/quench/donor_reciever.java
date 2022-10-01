package com.example.quench;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class donor_reciever extends AppCompatActivity {
    TextView ngo,user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_reciever);

        ngo= findViewById(R.id.ngo);
        user=findViewById(R.id.user);

        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(donor_reciever.this, loginpage_ngo.class);
                startActivity(intent);
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(donor_reciever.this, loginuser_main.class);
                startActivity(intent);
            }
        });
    }
}