package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BookingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Spinner sp;
        final boolean[] invalid = {false};
        final String[] Colector = {""};
        TextView txtalertName;
        EditText UserName, UserPassword, UserContact, UserComment;
        Button SubmitSave;
        RadioButton Malebtn, Femalbtn;
        CheckBox html, css, php;



        setContentView(R.layout.activity_booking);
        sp = findViewById(R.id.SpCountry);

        UserName = findViewById(R.id.userName);
        UserPassword = findViewById(R.id.userPassword);
        UserContact = findViewById(R.id.userContact);
        UserComment = findViewById(R.id.usercomment);
        txtalertName = findViewById(R.id.userAlert);
        Malebtn = findViewById(R.id.Male);
        Femalbtn = findViewById(R.id.Female);
        html = findViewById(R.id.HTML);
        css = findViewById(R.id.CSS);
        php = findViewById(R.id.PHP);
        SubmitSave = findViewById(R.id.submitbtn);


        SubmitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = UserName.getText().toString();
                String Pascode = UserPassword.getText().toString();
                String contact = UserContact.getText().toString();
                String comment = UserComment.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(BookingActivity.this, "Pleas fill the password field", Toast.LENGTH_SHORT).show();
                } else if (name.equals("Sameh") || name.equals("UlHaq")) {

                    txtalertName.setText("Name Already exist");
                } else if (Pascode.isEmpty()) {
                    Toast.makeText(BookingActivity.this, "Pleas fill the password field", Toast.LENGTH_SHORT).show();
                } else if (contact.isEmpty()) {
                    Toast.makeText(BookingActivity.this, "Pleas fill the Contact field", Toast.LENGTH_SHORT).show();
                } else if (comment.isEmpty()) {
                    Toast.makeText(BookingActivity.this, "Pleas fill the Comment field", Toast.LENGTH_SHORT).show();
                } else {

                    Colector[0] += name + "\n";
                    Colector[0] += Pascode + "\n";
                    Colector[0] += contact + "\n";
                    Colector[0] += comment + "\n";
                    if (html.isChecked()) {
                        Colector[0] += "HTML" + "\n";
                        if (css.isChecked()) {
                            Colector[0] += "CSS" + "\n";
                        }
                        if (php.isChecked()) {
                            Colector[0] += "PHP" + "\n";
                        }
                    }
                    Toast.makeText(BookingActivity.this, "User Info \n:" + Colector[0], Toast.LENGTH_SHORT).show();
                }

            }
        });

        List<String> categoryCountry = new ArrayList<>();
        categoryCountry.add("Select Time");
        categoryCountry.add("14:00");
        categoryCountry.add("16:00");
        categoryCountry.add("18:00");
        categoryCountry.add("20:00");
        categoryCountry.add("22:00");
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categoryCountry);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                if (parent.getItemAtPosition(position).equals("Select Time")) {
                    //Do Nothing

                } else {
                    String item = parent.getItemAtPosition(position).toString();
                    Colector[0] += item + "\n";
                    Toast.makeText(BookingActivity.this, "Selected Time: " + item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    }
