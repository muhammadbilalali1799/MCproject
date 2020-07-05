package com.example.pdf.download.findnearbyplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView imageView1 ;
    TextView textView1 , textView2;
    Animation sideAnim , bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView1 = (ImageView)findViewById(R.id.layout_logo);
        textView1 = (TextView)findViewById(R.id.layout_text1);
        textView2 = (TextView)findViewById(R.id.layout_text2);

        sideAnim = AnimationUtils.loadAnimation(this , R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this , R.anim.bottom_anim);

        imageView1.setAnimation(sideAnim);
        textView2.setAnimation(bottomAnim);

        Thread td = new Thread()
        {
            public void run()
            {
                try {

                    sleep(2500);
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
