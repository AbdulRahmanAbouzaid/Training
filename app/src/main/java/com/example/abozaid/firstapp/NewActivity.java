package com.example.abozaid.firstapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText("hello " + name);
    }

    public  void backAct(View v){
        finish();
    }
}
