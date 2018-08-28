package com.matthew.micromatt.parcelableactivity3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.matthew.micromatt.parcelableactivity3.Models.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Ingresar Datos de Usuario");
        ((EditText)findViewById(R.id.AgeEditText)).setTransformationMethod(null);

    }

    public void AddUser(View view) {
        String name, lastName;
        int age;
        name = ((EditText)findViewById(R.id.NameEditText)).getText().toString();
        lastName = ((EditText)findViewById(R.id.LastNameEditText)).getText().toString();

        String stAge = ((EditText)findViewById(R.id.AgeEditText)).getText().toString();
        age = Integer.parseInt((stAge != null && !stAge.isEmpty()) ? stAge : "0");

        User user = new User(name, lastName, age);

        Intent intent = new Intent(MainActivity.this, UserViewActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}
