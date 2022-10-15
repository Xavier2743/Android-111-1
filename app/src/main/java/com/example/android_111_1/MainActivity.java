package com.example.android_111_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        textView1 = (TextView) findViewById(R.id.textView1);
    }

    public void button_click(View V) {
        String editText_content = editText.getText().toString();
        if (editText_content.equals("abc")) {
            textView1.setText("總統好");
        }
        else if (editText_content.equals("def")) {
            textView1.setText("校長好");
        }
        else {
            textView1.setText("你好，" + editText_content);
        }
    }

}
