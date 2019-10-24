package com.example.fragmenttest;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragTwo extends Fragment {

    public FragTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.v("Fragment3","onCreateView 프래그먼트와 관련되는 뷰계층 만들어서 리턴");
        return inflater.inflate(R.layout.fragment_frag_two, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.v("Fragment2","onAttach 프래그먼트가 액티비티와 연결시 호출");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Fragment2","onCreate 프래그먼트 초기화시 호출");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("Fragment2","onActivityCreated 연결된 액티비티 onCreate() 완료 후 호출");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("Fragment2","onStart 사용자에게 프래그먼트 보일 때");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("Fragment2","onResume 사용자와 상호작용 가능");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("Fragment2","onPause 연결된 액티비티가 onPause()되어 사용자와 상호작용 중지시 호출");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("Fragment2","onStop 연결 액티비티가 onStop()되어 화면에서 더이상 보이지x / 프래그먼트 기능 중지시");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("Fragment2","onDestroyView 프래그먼트 관련 뷰 리소스 해재할 수 있도록 호출");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("Fragment2","onDestroy 프래그먼트 상태를 마지막으로 정리할 수 있도록 호출");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("Fragment2","onDetach 액티비티와 연결 끊기 바로전 호출");
    }
}

