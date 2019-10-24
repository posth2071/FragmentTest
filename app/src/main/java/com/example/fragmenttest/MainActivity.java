package com.example.fragmenttest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    FragOne frag1;
    FragTwo frag2;
    FragThree frag3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        frag1 = new FragOne();
        frag2 = new FragTwo();
        frag3 = new FragThree();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, frag1).commit();      //프래그먼트1 표시

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // 어떤 메뉴 아이템이 터치되었는지 확인합니다.
        switch (menuItem.getItemId()) {
            case R.id.menuitem_bottombar_up:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment, frag1) // 표시할 레이아웃, 변경할 프래그먼트 설정
                        .addToBackStack(null)          // 백스택에 변겅전 프래그먼트 저장
                        .commit();                     // 트랜잭션 실행
                return true;
            case R.id.menuitem_bottombar_down:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag2).addToBackStack(null).commit();
                return true;

            case R.id.menuitem_bottombar_search:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag3).addToBackStack(null).commit();
                return true;
        }
        return false;
    }
}
