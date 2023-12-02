package com.sachin.stringpalindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String s1="mam";
    String reverse="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        char ch[]=s1.toCharArray();

        for (int i=ch.length-1;i>=0;i--)
        {
            reverse=reverse+ch[i];
        }

        if (s1.equals(reverse))
        {
            Log.d("sringPalindrome","Yes Palindrome");
        }
        else {
            Log.d("sringPalindrome","No Palindrome");

        }
        Log.d("revrseString",reverse);
    }
}