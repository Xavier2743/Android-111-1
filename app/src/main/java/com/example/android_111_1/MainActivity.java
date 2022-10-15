package com.example.android_111_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count, number, temp0, temp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
        number = 0;
        temp0 = 0;
        temp1 = 0;
    }

    public void button0_click(View V) {
        if (count == 1) {
            temp1 = 1;
        }
        number = temp0 + temp1;
        temp1 = temp0;
        temp0 = number;
        count ++;

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(Integer.toString(number));
    }

    public void button1_click(View V) {
        count = 0;
        number = 0;
        temp0 = 0;
        temp1 = 0;

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(Integer.toString(number));
    }
}
