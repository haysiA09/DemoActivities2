package com.example.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the button and set the OnClickListener
        Button btnDone=findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                //Get Edit Text that user key in name
                EditText etName=findViewById(R.id.editTextName);
                //Get Edit Text that user key in age
                EditText etAge=findViewById(R.id.editTextAge);
                //Put the name and age in array
                String[] info={etName.getText().toString(),etAge.getText().toString()};
                //Create an intent to start another activity called DemoActivities
                Intent i = new Intent(MainActivity.this,DemoActivities2.class);
                //pass String array holding the name and age to the new activity
                i.putExtra("info",info);
                //start new activity
                startActivity(i);
            }});
    }
}
