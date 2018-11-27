package com.example.cathleen.intense;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SouthQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_q);
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
        if (v.getId() == R.id.button){
            Double myLatitude = 14.416187;
            Double myLongitude = 121.033108;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        } else if (v.getId() == R.id.button7){
            Double myLatitude = 14.5253623;
            Double myLongitude = 121.0611922;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button15){
            Double myLatitude = 14.537985;
            Double myLongitude = 121.070897;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button17){
            Double myLatitude = 14.559931;
            Double myLongitude = 121.020918;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button16) {
            Double myLatitude = 14.4706238;
            Double myLongitude = 121.0221973;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button18){
            Double myLatitude = 14.3839978;
            Double myLongitude = 121.0311004;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }else if (v.getId() == R.id.button19){
            Double myLatitude = 14.524987;
            Double myLongitude = 121.0187673;
            String urlAddress = "http://maps.google.com/maps?q=" + myLatitude  + "," + myLongitude + "&fov=90&heading=235&pitch=10&sensor=false";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
            startActivity(intent);
        }
    }
}
