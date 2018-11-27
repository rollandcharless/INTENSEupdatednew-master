package com.example.cathleen.intense;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class EastQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_q);
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

    public void showMessage(View v){
        Toast.makeText( this, "previous page", Toast.LENGTH_LONG).show();

    }

    public void showMess(View v) {
        Toast.makeText( this, "next page", Toast.LENGTH_LONG).show();
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.button8){
            Double myLatitude = 14.6646857;
            Double myLongitude = 121.1157744;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        } else if (v.getId() == R.id.button9){
            Double myLatitude = 14.5785431;
            Double myLongitude = 121.0643997;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button12){
            Double myLatitude = 14.6330277;
            Double myLongitude =121.0967926;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button13){
            Double myLatitude = 14.6297639;
            Double myLongitude = 121.0942744;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button14){
            Double myLatitude = 14.6204335;
            Double myLongitude = 121.0852753;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }
    }
}
