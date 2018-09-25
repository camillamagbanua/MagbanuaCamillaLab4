package com.magbanua.camilla;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITG", "onCreate() has been executed");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITG", "onStart() has been executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITG", "onResume() has been executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ITG", "onPause() has been executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITG", "onStop() has been executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITG", "onDestroy() has been executed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ITG", "onRestart() has been executed");
    }

    public void showMessage(View V){
        Toast.makeText(this, "Say bye to Chinese Cemetery", Toast.LENGTH_LONG).show();
    }
    public void showSnackMessage(View V){
        Snackbar.make(V, "Loading Next Attraction", Snackbar.LENGTH_LONG).show();
    }
}
