package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragOne frag1;
    FragTwo frag2;
    FragThree frag3;
    Button bt1, bt2, bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(this);

        bt2 = (Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(this);

        bt3 = (Button)findViewById(R.id.bt3);
        bt3.setOnClickListener(this);

        frag1 = new FragOne();
        //frag1 = (FragOne)getSupportFragmentManager().findFragmentById(R.id.fragment);
        frag2 = new FragTwo();
        frag3 = new FragThree();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, frag1).commit();      //프래그먼트1 표시
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment, frag1) // 표시할 레이아웃, 변경할 프래그먼트 설정
                        .addToBackStack(null)          // 백스택에 변겅전 프래그먼트 저장
                        .commit();                     // 트랜잭션 실행
                break;
            case R.id.bt2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag2).addToBackStack(null).commit();
                break;
            case R.id.bt3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, frag3).addToBackStack(null).commit();
                break;
        }
    }
}
