package com.example.dian.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityRadioButton extends AppCompatActivity {
    private CheckBox cbWindows, cbMac, cbLinux;
    private Button bt_submit_checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        setCheckBoxListener();
        setButtonListener();

        final RadioGroup rgGender = (RadioGroup) findViewById(R.id.rg_gender);
        Button btSubmit = (Button) findViewById(R.id.bt_submit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rgGender.getCheckedRadioButtonId();
                switch (id){
                    case R.id.rb_male :
                        Toast.makeText(ActivityRadioButton.this,"Clicked "+((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_female :
                        Toast.makeText(ActivityRadioButton.this,"Clicked "+((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
    private void setCheckBoxListener() {
        cbWindows = (CheckBox) findViewById(R.id.cb_windows);
        cbWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(ActivityRadioButton.this,"Ngga pingin pake Mac bro ? :)", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void setButtonListener() {
        cbWindows = (CheckBox) findViewById(R.id.cb_windows);
        cbMac = (CheckBox) findViewById(R.id.cb_macos);
        cbLinux = (CheckBox) findViewById(R.id.cb_linux);

        bt_submit_checkbox = (Button) findViewById(R.id.bt_submit_checkbox);

        bt_submit_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "Windows check " + cbWindows.isChecked()
                        + "\n MacOS check " + cbMac.isChecked()
                        + "\n Linux check " + cbLinux.isChecked();

                Toast.makeText(ActivityRadioButton.this,status, Toast.LENGTH_LONG).show();
            }
        });
}
}
