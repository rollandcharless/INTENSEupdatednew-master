package com.example.cathleen.intense;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class NorthQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_q);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start", "onStart has executed...");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume", "onResume has executed...");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause", "onPause has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop", "onStop has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart", "onRestart has executed...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy", "onDestroy has executed...");

    }

    public void process (View v){

        if (v.getId() == R.id.Button1){
            Double myLatitude = 14.642000;
            Double myLongitude = 120.988270;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        } else if (v.getId() == R.id.button2){
            Double myLatitude = 14.685392;
            Double myLongitude = 120.990950;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button22){
            Double myLatitude = 14.6538467;
            Double myLongitude = 121.0663401;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button23){
            Double myLatitude = 14.605846;
            Double myLongitude = 121.0279992;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }
    }
}