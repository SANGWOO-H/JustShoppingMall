package org.teachtown.justshoppingmall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    private BackKeyClickHandler backKeyClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setWindowAnimations(0);

        ImageView backgroundImageView = findViewById(R.id.imageView);
        Glide.with(this).load(R.raw.slide).into(backgroundImageView);

        ViewPager vp = findViewById(R.id.pager);
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        TabLayout tab = findViewById(R.id.tab);
        tab.setupWithViewPager(vp);

        Button b = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        Menu.class); // 다음 넘어갈 클래스 지정
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

        backKeyClickHandler = new BackKeyClickHandler(this);
    }

    @Override public void onBackPressed() {
            //super.onBackPressed();
            backKeyClickHandler.onBackPressed();
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

    public void a3(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a3.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void a4(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a4.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void a5(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a5.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void a6(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                a6.class); // 다음 넘어갈 클래스 지정
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

    public void b1(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b1.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b2(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b2.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b3(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b3.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b4(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b4.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b5(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b5.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b6(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b6.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b7(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b7.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void b8(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                b8.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }

    public void c1(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                c1.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
    }
}
