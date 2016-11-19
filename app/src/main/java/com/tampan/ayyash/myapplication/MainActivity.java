package com.tampan.ayyash.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       b= (Button) findViewById(R.id.button);
       t = (EditText) findViewById(R.id.editText);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(t.getText().toString().equalsIgnoreCase("192.168.50.254")){
                    Intent i = new Intent(MainActivity.this, Web.class);
                    startActivity(i);
                    finish();
//                }else {
//                    Toast.makeText(MainActivity.this, "Server microtic salah", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}
