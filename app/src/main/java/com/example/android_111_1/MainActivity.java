package com.example.android_111_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
    }

    public void button0_click(View V) {
        count ++;
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(Integer.toString(count));
    }

    public void button1_click(View V) {
        count = 0;
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(Integer.toString(count));
    }
}
