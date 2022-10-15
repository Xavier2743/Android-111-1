package com.example.android_111_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText0;
    EditText editText1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText0 = (EditText) findViewById(R.id.editTextTextPersonName);
        editText1 = (EditText) findViewById(R.id.editTextTextPassword);
        textView = (TextView) findViewById(R.id.textView2);
    }

    public void button_click(View V) {
        String account = editText0.getText().toString();
        String password = editText1.getText().toString();

        if (account.equals("admin") && password.equals("123")) {
            textView.setText("Login Success");
        }
        else {
            textView.setText("Login Failed");
        }
    }

}
