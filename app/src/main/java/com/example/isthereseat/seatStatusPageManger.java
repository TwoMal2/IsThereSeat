package com.example.isthereseat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class seatStatusPageManger  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seat_status_page_manger);
        sungshin3F sungshin3F = new sungshin3F();

        // 가장 먼저 띄워줄 프래그먼트 설정
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, sungshin3F).commitAllowingStateLoss();

    }
}
