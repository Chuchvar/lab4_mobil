package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class ActivityThree extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
    String s = "відповідь прийнято";
    String s1 = "Ваш визначений рівень організованості";
    public void addPointA(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointB(View v) {
        // підрахунок поінтів;
        display(s);
    }
    public void addPointC(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        scoreView.setText(String.valueOf(s));
    }
    public void finished(View v) {
        displayResult();
    }
    public void displayResult() {
        TextView scoreView = findViewById(R.id.txt_result);
        scoreView.setText(s1);
    }
}
