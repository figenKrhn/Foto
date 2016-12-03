package com.example.wn81.foto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void azerBulbul (View view){
        Button abButton= (Button) findViewById(R.id.button);
        ImageView image= (ImageView) findViewById(R.id.imageView);

        image.setImageResource(R.drawable.ab);
            }



    public void doganKilic(View view){
        Button dkButton= (Button) findViewById(R.id.button2);
        ImageView image= (ImageView) findViewById(R.id.imageView);

        image.setImageResource(R.drawable.dg);
            }

}
