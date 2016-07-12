package com.example.tacademy.samplebasicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
    TextView test_text;
    TextView html_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        test_text = (TextView)findViewById(R.id.test_text);
        html_text = (TextView)findViewById(R.id.text_html);

        Button btn = (Button)findViewById(R.id.btn_selected);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test_text.setText(R.string.text_test);
                test_text.setSelected(!test_text.isSelected());
            }
        });
        btn = (Button)findViewById(R.id.btn_html);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = getResources().getString(R.string.text_html);
                html_text.setText(Html.fromHtml(str));
                html_text.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        btn = (Button)findViewById(R.id.btn_auto);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test_text.setText(R.string.text_auto);
            }
        });
    }
}
