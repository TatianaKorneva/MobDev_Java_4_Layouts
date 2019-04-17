package com.example.guess_the_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    EditText etInput;
    Button bControl;
    Random random = new Random();
    TextView right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.textView);
        etInput = findViewById(R.id.editText);
        bControl = findViewById(R.id.button);
        right = findViewById(R.id.textView2);

    }

    public void onClick(View view) {
        if (etInput.getText().toString().length()==0){
            tvInfo.setText(getResources().getString(R.string.er));
            right.setText("");
        }
        else {
            int value = Integer.parseInt(etInput.getText().toString());
            int i = random.nextInt(100 - 0 + 1);
            if (value < i) {
                tvInfo.setText(getResources().getString(R.string.behind));
                right.setText(getResources().getString(R.string.ans) + i);
                etInput.setText("");
            }
            if (value == i) {
                tvInfo.setText(getResources().getString(R.string.hit));
                right.setText("");
                etInput.setText("");
            }
            if (value > i) {
                tvInfo.setText(getResources().getString(R.string.ahead));
                right.setText(getResources().getString(R.string.ans) + i);
                etInput.setText("");
            }
            if (value > 100 | value < 1) {
                etInput.setText("");
                tvInfo.setText(getResources().getString(R.string.error));
                right.setText("");
            }
        }

    }

    public void Exit(View view){
        finish();
    }


}

