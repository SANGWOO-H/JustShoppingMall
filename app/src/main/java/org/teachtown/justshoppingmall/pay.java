package org.teachtown.justshoppingmall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        Button d = (Button)findViewById(R.id.yes);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);
                finish();// 다음 화면으로 넘어간다

                Toast.makeText(getApplicationContext(), "주문해주셔서 감사합니다.", Toast.LENGTH_LONG).show();
            }
        });

        Button e = (Button)findViewById(R.id.no);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);
                finish();// 다음 화면으로 넘어간다

                Toast.makeText(getApplicationContext(), "예쁘게 봐주셔서 감사합니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
