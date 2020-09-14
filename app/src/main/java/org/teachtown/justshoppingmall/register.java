package org.teachtown.justshoppingmall;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            getWindow().setWindowAnimations(0);

            Button sign = (Button) findViewById(R.id.b4);
            sign.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "죄송합니다. 돌아가세요.", Toast.LENGTH_LONG).show();
                    finish();
                }
            });

        }
    }
