package com.example.poppickimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private ImageView imageView;
    private TextView headertext, detailstext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.detailsImageId);
        headertext = findViewById(R.id.headerTextId);
        detailstext = findViewById(R.id.detailsTextId);

        String value = getIntent().getStringExtra("key");
        if(value.equals("C Programming Language"))
        {
            setTitle("C Programming Language");
            imageView.setImageResource(R.drawable.c);
            headertext.setText("C Programming Language");
            detailstext.setText(R.string.c);
        }
        else if(value.equals("C++ Programming Language"))
        {
            setTitle("C++ Programming Language");
            imageView.setImageResource(R.drawable.cplus);
            headertext.setText("C++ Programming Language");
            detailstext.setText(R.string.cplus);
        }
        if(value.equals("C# Programming Language"))
        {
            setTitle("C# Programming Language");
            imageView.setImageResource(R.drawable.chash);
            headertext.setText("C# Programming Language");
            detailstext.setText(R.string.chash);
        }
        if(value.equals("Java Programming Language"))
        {
            setTitle("Java Programming Language");
            imageView.setImageResource(R.drawable.java);
            headertext.setText("Java Programming Language");
            detailstext.setText(R.string.java);
        }
        if(value.equals("Python Programming Language"))
        {
            setTitle("Python Programming Language");
            imageView.setImageResource(R.drawable.python);
            headertext.setText("Python Programming Language");
            detailstext.setText(R.string.python);
        }
        if(value.equals("Ruby Programming Language"))
        {
            setTitle("Ruby Programming Language");
            imageView.setImageResource(R.drawable.ruby);
            headertext.setText("Ruby Programming Language");
            detailstext.setText(R.string.ruby);
        }
        if(value.equals("JavaScript Programming Language"))
        {
            setTitle("JavaScript Programming Language");
            imageView.setImageResource(R.drawable.javascript);
            headertext.setText("JavaScript Programming Language");
            detailstext.setText(R.string.javascript);
        }
        if(value.equals("PHP Programming Language"))
        {
            setTitle("PHP Programming Language");
            imageView.setImageResource(R.drawable.php);
            headertext.setText("PHP Programming Language");
            detailstext.setText(R.string.php);
        }
        if(value.equals("Swift Programming Language"))
        {
            setTitle("Swift Programming Language");
            imageView.setImageResource(R.drawable.swift);
            headertext.setText("Swift Programming Language");
            detailstext.setText(R.string.swift);
        }


    }
}