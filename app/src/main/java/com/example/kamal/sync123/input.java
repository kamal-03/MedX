package com.example.kamal.sync123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class input extends AppCompatActivity {

Button mButton;
EditText mEdit;
public TextView mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        mButton = (Button)findViewById(R.id.button1);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Class c;
                mEdit = (EditText) findViewById(R.id.editText1);
                mText = (TextView) findViewById(R.id.textView1);
                mText.setText(mEdit.getText().toString());


            }
        });
    }
}
