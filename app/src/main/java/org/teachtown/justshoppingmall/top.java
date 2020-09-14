package org.teachtown.justshoppingmall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class top extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
    }

    public void a1(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a1.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void a2(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a2.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void a7(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a7.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void a8(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a8.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b2(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b2.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }
}
