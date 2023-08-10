package com.iamap.matrixcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Determinant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinant);
    }
    public void OpenOrder2(View v){
//        Toast.makeText(this, "This button is working properly!", Toast.LENGTH_SHORT).show();
        Log.d("General","Order2 button worked properly");
        Intent intent = new Intent(this,Order2.class);
        startActivity(intent);
        Log.d("General", "Order2 page is opened successfully");
    }
    public void OpenOrder3(View v){
//        Toast.makeText(this, "This button is working properly!", Toast.LENGTH_SHORT).show();
        Log.d("General","Order3 button worked properly");
        Intent intent = new Intent(this,Order3.class);
        startActivity(intent);
        Log.d("General", "Order3 page is opened successfully");
    }
    public void OpenOrder4(View v){
//        Toast.makeText(this, "This button is working properly!", Toast.LENGTH_SHORT).show();
        Log.d("General","Order4 button worked properly");
        Intent intent = new Intent(this,Order4.class);
        startActivity(intent);
        Log.d("General", "Order4 page is opened successfully");
    }
    public void OpenOrder5(View v){
//        Toast.makeText(this, "This button is working properly!", Toast.LENGTH_SHORT).show();
        Log.d("General","Order5 button worked properly");
        Intent intent = new Intent(this,Order5.class);
        startActivity(intent);
        Log.d("General", "Order5 page is opened successfully");
    }

}