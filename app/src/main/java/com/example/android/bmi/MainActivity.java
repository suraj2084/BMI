package com.example.android.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculate;
        TextView Result;
        EditText HFT,HIN,Weight;
        HFT=findViewById(R.id.editFT);
        HIN=findViewById(R.id.editIn);
        Weight=findViewById(R.id.editW);
        calculate=findViewById(R.id.btnCal);
        Result=findViewById(R.id.txtRes);
        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
              int wt= Integer.parseInt(Weight.getText().toString());
              int ft= Integer.parseInt(HFT.getText().toString());
              int in= Integer.parseInt(HIN.getText().toString());
              double totalIn=ft*12+in;
              double totalCm=totalIn*2.53;
              double meter=totalCm/100;
              double result= wt/Math.pow(meter, 2);
              if(result<18.5){
                  Result.setText("You're UnderWeight");
              }else if(result>=18.5 && result <=24.9){
                  Result.setText("You're Healthy.");
                } else if (result>30){
                  Result.setText(" You're OverWeight");
              }
            }
        });
    }


}