package com.example.android.password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Bundle intent = getIntent().getExtras();
        String pin = intent.getString("pin_set_is");
        String extra = "PIN SET IS = " ;
        TextView textView = findViewById(R.id.textView);
        textView.setText(extra+pin);
    }
}
