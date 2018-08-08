package com.example.dian.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonid, btnLinearLayout, btnRelative, btnSpinner,btnRadioButton,btnAlertDialog,btnTypeInput,btnDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonid = (Button) findViewById(R.id.buttonid);
        buttonid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        });
        btnLinearLayout = (Button) findViewById(R.id.btnLinearLayout);
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(intent);
            }
        });
        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(intent);
            }
        });
        btnSpinner = (Button) findViewById(R.id.btnSpinner);
        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpinnerActivit.class);
                startActivity(intent);
            }
        });
        btnRadioButton = (Button) findViewById(R.id.btnRadioButton);
        btnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityRadioButton.class);
                startActivity(intent);
            }
        });
        btnAlertDialog = (Button) findViewById(R.id.btnAlertDialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(intent);
            }
        });
        btnTypeInput = (Button) findViewById(R.id.btnTypeInput);
        btnTypeInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TypeInput.class);
                startActivity(intent);
            }
        });
        btnDate = (Button) findViewById(R.id.btnDate);
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainDatePicker.class);
                startActivity(intent);
            }
        });
    }
}
