package com.example.dian.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivit extends AppCompatActivity {
    private Spinner spNamen, spNamen2;
    private String[] germanFeminine = {
            "Karin",
            "Ingrid", "Helga",
            "Renate",
            "Elke",
            "Ursula",
            "Erika",
            "Christa",
            "Gisela",
            "Monika"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spNamen = (Spinner) findViewById(R.id.sp_name);

        Button btSpinner = (Button) findViewById(R.id.bt_check);
        btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SpinnerActivit.this, "Selected "+ spNamen.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        spNamen2 = (Spinner) findViewById(R.id.sp_name_2);

        // inisialiasi Array Adapter dengan memasukkan string array di atas
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, germanFeminine);

        // mengeset Array Adapter tersebut ke Spinner
        spNamen2.setAdapter(adapter);

        // mengeset listener untuk mengetahui saat item dipilih
        spNamen2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // memunculkan toast + value Spinner yang dipilih (diambil dari adapter)
                Toast.makeText(SpinnerActivit.this, "Selected "+ adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
