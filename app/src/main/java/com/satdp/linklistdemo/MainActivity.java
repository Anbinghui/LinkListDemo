package com.satdp.linklistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.satdp.linklistdemo.link.MyLinkedList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "linkedList";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Log.e(TAG,list.toString());
        list.removeLast();
        Log.e(TAG,list.toString());
        list.remove(2);
        Log.e(TAG,list.toString());
        list.add(2,"666");
        Log.e(TAG,list.toString());
        Log.e(TAG,list.contains("666")+"");
        Log.e(TAG,list.get(2));
        list.clear();
        Log.e(TAG,list.size()+"");
    }
}
