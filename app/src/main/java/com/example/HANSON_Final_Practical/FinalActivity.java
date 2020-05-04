package com.example.HANSON_Final_Practical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.coopsbetterconcerts.R;


public class FinalActivity extends AppCompatActivity {
    Button pickDate;
    Button sumbitButton;

public void showDatePicker(View view) {
    DialogFragment newFragment = new DatePickerFragment();
    newFragment.show(getSupportFragmentManager(), "datePicker");
}

public void processDatePickerResult(int year, int month, int day) {
    String month_string = Integer.toString(month+1);
    String day_string = Integer.toString(day);
    String year_string = Integer.toString(year);
    String dateMessage = ("Date: " + month_string + "/" + day_string + "/" + year_string + ".");

    Toast.makeText(getApplicationContext(), dateMessage, Toast.LENGTH_LONG).show();
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        pickDate = findViewById(R.id.pickDate);
        pickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker(v);
            }
        });

        sumbitButton = findViewById(R.id.submitButton);
        sumbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
