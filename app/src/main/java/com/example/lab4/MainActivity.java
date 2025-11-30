package com.example.lab4;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String s = "відповідь прийнято";
    Button btnActTwo; // Перейменував "btn" на "btnActTwo" для кращої читабельності

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ініціалізація кнопки з повним R.id.
        btnActTwo = findViewById(R.id.btnActTwo);

        // Встановлення обробника кліків
        if (btnActTwo != null) {
            btnActTwo.setOnClickListener(this);
        }
    }

    // Анотація @SuppressLint("NonConstantResourceId") більше не потрібна
    @Override
    public void onClick(View v) {
        int id = v.getId();

        // Використовуємо if-else if для уникнення помилки "constant expression required"
        if (id == R.id.btnActTwo) {
            Intent intent = new Intent(this, ActiviTwo.class);
            startActivity(intent);
        }
        // Додайте інші кнопки тут, якщо вони використовують цей обробник
    }

    // Методи обробки кліків, викликані через атрибут android:onClick в XML

    public void addPointA(View v) {
        display(s);
    }

    public void addPointB(View v) {
        display(s);
    }

    public void addPointC(View v) {
        display(s);
    }

    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        if (scoreView != null) {
            scoreView.setText(s);
        }
    }
}