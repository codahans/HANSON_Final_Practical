package com.example.HANSON_Final_Practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.coopsbetterconcerts.R;

public class MainActivity extends AppCompatActivity {
    Button phoneButton;
    Button nextPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneButton = findViewById(R.id.phoneButton);

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = phoneButton.getText().toString();
                String fullPhone = "tel:" + phoneNumber;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(fullPhone));
                startActivity(intent);
            }

        });

        nextPageButton = findViewById(R.id.nextPageButton);
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
    }

    public void nextPage() {
        Intent intent = new Intent(this, OrderPage.class);
        startActivity(intent);
    }
}
