package com.matthew.micromatt.parcelableactivity3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.matthew.micromatt.parcelableactivity3.Models.User;

public class UserViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);
        getSupportActionBar().setTitle("Información de Usuario");

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user");

        ((TextView)findViewById(R.id.NameTextView)).setText(user.getName());
        ((TextView)findViewById(R.id.LastNameTextView)).setText(user.getLastName());
        ((TextView)findViewById(R.id.AgeTextView)).setText(user.getAge() + " Años");
    }
}
