package com.example.college_hours_tracker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Output extends AppCompatActivity {
    static final String Database_Url="localhost";
    static final String Database_name="id14690037_student";
    static final String User_name="id14690037_sampada";
    static final String Password="id2hDI?e?<fW-6ow";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        if(getIntent().hasExtra("PRN"))
        {
            TextView op= (TextView)findViewById(R.id.output);
            String op_text = getIntent().getExtras().getString("PRN");
            op.setText(op_text);

        }

    }
}