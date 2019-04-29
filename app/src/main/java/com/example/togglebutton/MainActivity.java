package com.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    Switch aSwitch;
    TextView toggleTextView;
    TextView switchTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.aSwitch);
        toggleTextView = findViewById(R.id.toggleTextView);
        switchTextView = findViewById(R.id.switchTextView);
    }

    public void onButtonClick(View view) {
        if (toggleButton.isChecked()) {
            toggleTextView.setText("Toggle verdadeiro");
        } else {
            toggleTextView.setText("Toggle false");
        }

        if (aSwitch.isChecked()) {
            switchTextView.setText("Switch verdadeiro");
        } else {
            switchTextView.setText("Switch falso");
        }
    }
}
