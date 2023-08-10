package com.iamap.matrixcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenOrder(View v){
//        Toast.makeText(this, "This button is working properly!", Toast.LENGTH_SHORT).show();
        Log.d("General","ChooseOrder button worked properly");
        Intent intent = new Intent(this,Determinant.class);
        startActivity(intent);
        Log.d("General", "ChooseOrder page is opened successfully");
    }

}