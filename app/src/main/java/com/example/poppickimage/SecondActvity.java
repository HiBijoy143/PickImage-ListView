package com.example.poppickimage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActvity extends AppCompatActivity {

    private ListView listView;
    private int[] image = {R.drawable.c,R.drawable.cplus,R.drawable.chash,R.drawable.java,
            R.drawable.python,R.drawable.ruby,R.drawable.javascript,R.drawable.php,R.drawable.swift};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setTitle("ListView");
        listView = findViewById(R.id.listViewId);
        final String[] lang_name = getResources().getStringArray(R.array.lang_name);
        CustomList customlist = new CustomList(this,image,lang_name);
        listView.setAdapter(customlist);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = lang_name[i];
                Toast.makeText(SecondActvity.this, value, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActvity.this,Details.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int j, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SecondActvity.this);
                builder.setTitle("Delete!");
                builder.setMessage("Do you want to Delete");
                builder.setIcon(R.drawable.delete_icon);
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String option = lang_name[j];
                        Toast.makeText(SecondActvity.this, "Delete:"+option, Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alertDialog = builder.create();
                builder.show();
                return true;
            }
        });
    }
}