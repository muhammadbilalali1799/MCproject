package com.example.pdf.download.findnearbyplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread td = new Thread()
        {
            public void run()
            {
                try {
                    sleep(5000);
                }
                catch (Exception exc)
                {
                    exc.printStackTrace();
                }
                finally {
                    Intent i = new Intent(getBaseContext(), MapsActivity.class);
                    startActivity(i);
                }
            }
        };
        td.start();
    }
}
