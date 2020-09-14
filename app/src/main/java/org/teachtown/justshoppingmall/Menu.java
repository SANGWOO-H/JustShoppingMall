package org.teachtown.justshoppingmall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    private BackKeyClickHandler backKeyClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getWindow().setWindowAnimations(0);

        Button a = (Button)findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);
                finish();// 다음 화면으로 넘어간다
            }
        });

        Button c = (Button)findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        info.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);
                finish();// 다음 화면으로 넘어간다
            }
        });

        ImageButton button = (ImageButton)findViewById(R.id.m1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        top.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.m2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);// 다음 화면으로 넘어간다
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.m3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);// 다음 화면으로 넘어간다
            }
        });

        ImageButton button4 = (ImageButton)findViewById(R.id.m4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);// 다음 화면으로 넘어간다
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.m5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });


        ImageButton button6 = (ImageButton)findViewById(R.id.m6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        ImageButton button7 = (ImageButton)findViewById(R.id.m7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        ImageButton button8 = (ImageButton)findViewById(R.id.m8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        ImageButton button9 = (ImageButton)findViewById(R.id.m9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        object.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        backKeyClickHandler = new BackKeyClickHandler(this);
    }

    @Override public void onBackPressed() {
        //super.onBackPressed();
        backKeyClickHandler.onBackPressed();
    }
}
