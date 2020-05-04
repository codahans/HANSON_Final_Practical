package com.example.HANSON_Final_Practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.coopsbetterconcerts.R;

public class OrderPage extends AppCompatActivity {
    ImageButton nextPageButton;
    ImageButton toastButton1;
    ImageButton toastButton2;
    ImageButton toastButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderpage);

        nextPageButton = findViewById(R.id.nextPageButton);
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });

        toastButton1 = findViewById(R.id.toastButton1);
        toastButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Snack, Crackle, POP!", Toast.LENGTH_LONG);
                    toast.show();
            }
        });

        toastButton2 = findViewById(R.id.toastButton2);
        toastButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "80s groove!", Toast.LENGTH_LONG);
                    toast.show();
            }
        });

        toastButton3 = findViewById(R.id.toastButton3);
        toastButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Rock On!", Toast.LENGTH_LONG);
                    toast.show();
            }
        });
    }

    public void nextPage() {
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }
}
