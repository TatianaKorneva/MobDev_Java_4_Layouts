package com.example.click;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView mainText;
    Button mainBtn;
    Button mainBtn2;
    Button mainBtn3;
    ImageButton imgBtn;

    private long score = 0;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);
        mainBtn2 = (Button) findViewById(R.id.button2);
        mainBtn3 = (Button) findViewById(R.id.button3);
        imgBtn = (ImageButton) findViewById(R.id.imageButton);



        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                if(Math.abs(score)<10 & 1<score & score<5 | Math.abs(score)>20 & Math.abs(score)<100 & 1<score%10 & score%10<5
                        | Math.abs(score)>100 & Math.abs(score)<1000 & 1<score%100 & score%100<5) {
                    r=getResources().getString(R.string.s1);
                } else {
                    r=getResources().getString(R.string.s2);
                }
                String s = getResources().getString(R.string.b) + " " + score + " " + r;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                if(Math.abs(score)<10 & 1<score & score<5 | Math.abs(score)>20 & Math.abs(score)<100 & 1<score%10 & score%10<5
                        | Math.abs(score)>100 & Math.abs(score)<1000 & 1<score%100 & score%100<5) {
                    r=getResources().getString(R.string.s1);
                } else {
                    r=getResources().getString(R.string.s2);
                }
                String s = getResources().getString(R.string.b) + " " + score + " " + r;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn2.setOnClickListener(clickListener2);

        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = getResources().getString(R.string.b)+ " " + score + " " + getResources().getString(R.string.s3);
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn3.setOnClickListener(clickListener3);

        View.OnClickListener clickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 555;
                String s = getResources().getString(R.string.special)+ " " + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        imgBtn.setOnClickListener(clickListener4);
    }
}

