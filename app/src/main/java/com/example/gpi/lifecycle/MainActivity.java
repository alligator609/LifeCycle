 package com.example.gpi.lifecycle;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
         Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        
    }
     protected void onStart(){
         super.onStart();
        Log.d("lifecycle","onStart invoked");
         Toast.makeText(getApplicationContext(), "on start", Toast.LENGTH_SHORT).show();
     }
     @SuppressLint("MissingSuperCall")
     protected void onResume(){
         super.onResume();
         Log.d("lifecycle","on Resume");
         Toast.makeText(getApplicationContext(), "onresume", Toast.LENGTH_SHORT).show();    

     }
     protected void onPause(){
      
         super.onPause();
         Log.d("Life  Cycle","on Pause");
         Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

     }
protected void onRestart(){
    super.onRestart();     
         Log.d("Life cycle","On start");
    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
    }

 
 }
   
