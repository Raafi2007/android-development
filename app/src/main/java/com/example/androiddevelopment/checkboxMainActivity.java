package com.example.androiddevelopment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class checkboxMainActivity extends AppCompatActivity {


    CheckBox cb1,cb2,cb3, cb4;
    Button order;
    TextView bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_activity_main);
        cb1 = findViewById(R.id.Briyani);
        cb2 = findViewById(R.id.curd);
        cb3 = findViewById(R.id.lemon);
        cb4 = findViewById(R.id.idly);
        order = findViewById(R.id.book);
        bill = findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total =0;
                boolean isAnyChecked = false;
                if(cb1.isChecked()){
                    total=total+120;
                    isAnyChecked = true;
                }
                if(cb2.isChecked()){
                    total=total+30;
                    isAnyChecked = true;
                }
                if(cb3.isChecked()){
                    total=total+50;
                    isAnyChecked = true;
                }
                if(cb4.isChecked()){
                    total=total+200;
                    isAnyChecked = true;
                }

                if(!isAnyChecked) {
                    bill.setText("Please select any checkbox");
                    Toast.makeText(checkboxMainActivity.this, "Please check a box to get the price", Toast.LENGTH_SHORT).show();
                } else {
                    bill.setText("Your bill is " + String.valueOf(total) + " rs");
                    Toast.makeText(checkboxMainActivity.this, "Booking confirmed", Toast.LENGTH_SHORT).show();
                }

            }
        });



    };

    }


