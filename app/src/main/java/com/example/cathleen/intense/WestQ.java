package com.example.cathleen.intense;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class WestQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west_q);Intent i = new Intent(this, CustomService.class);
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

    public void pro (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.button10){
            Double myLatitude = 14.6575629;
            Double myLongitude = 120.950395;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        } else if (v.getId() == R.id.button11){
            Double myLatitude =14.5845762;
            Double myLongitude = 120.9727114;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button20){
            Double myLatitude = 14.5446795;
            Double myLongitude = 120.9898513;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button21){
            Double myLatitude = 14.6095132;
            Double myLongitude = 120.9876451;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }
    }

}
