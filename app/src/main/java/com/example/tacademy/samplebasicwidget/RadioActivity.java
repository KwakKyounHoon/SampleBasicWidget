package com.example.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    boolean force = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(!force){
                    showResult(i);
                }
            }
        });
        Button btn = (Button)findViewById(R.id.btn_gob2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                force = true;
                int id = radioGroup.getCheckedRadioButtonId();
                showResult(id);
                radioGroup.check(R.id.btn_b2);
                force = false;
            }
        });
    }

    void showResult(int id){
        String str = null;
        switch (id){
            case R.id.btn_b1 :
                str = "b1";
                break;
            case R.id.btn_b2 :
                str = "b2";
                break;
            case R.id.btn_b3 :
                str = "b3";
                break;
        }
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}
