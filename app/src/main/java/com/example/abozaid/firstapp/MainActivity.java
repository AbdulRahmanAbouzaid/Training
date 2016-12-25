package com.example.abozaid.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.editText);
                if(et.getText() != null) {
                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
                    intent.putExtra("username", et.getText());
                    startActivity(intent);
                }else {
                    TextView er = (TextView) findViewById(R.id.empty);
                    er.setText("please enter a name");
                }
            }
        });
    }
}
