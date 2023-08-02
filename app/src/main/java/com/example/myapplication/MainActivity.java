package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void RegisterBtn (View view){

        EditText editTxtName = findViewById(R.id.InputName);
        TextView txtName= findViewById(R.id.OutputName);
        txtName.setText("Name: "+editTxtName.getText().toString());

        EditText editTxtSurname = findViewById(R.id.InputSurname);
        TextView txtSurname = findViewById(R.id.outputSurname);
        txtSurname.setText("Surname: "+editTxtSurname.getText().toString());

        EditText editTxtEmail = findViewById(R.id.Email);
        TextView txtEmail = findViewById(R.id.outputEmail);
        txtEmail.setText("Email: "+editTxtEmail.getText().toString());





    }

}