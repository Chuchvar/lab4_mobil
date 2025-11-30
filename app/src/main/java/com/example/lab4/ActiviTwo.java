package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActiviTwo extends AppCompatActivity implements View.OnClickListener {

    String s = "відповідь прийнято";
    Button btnActThree;

    // Примітка: Статичний імпорт 'import static com.example.lab4.R.id.btnActThree;' було видалено.
    // Анотація @SuppressLint("NonConstantResourceId") була видалена.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        // Ініціалізація кнопки
        btnActThree = findViewById(R.id.btnActThree);

        // Встановлення обробника кліків для переходу
        if (btnActThree != null) {
            btnActThree.setOnClickListener(this);
        }
    }

    // Обробник подій для кнопок, яким призначено setOnClickListener(this)
    @Override
    public void onClick(View v) {
        int id = v.getId();

        // Використовуємо if-else if для уникнення помилки "constant expression required"
        if (id == R.id.btnActThree) {
            Intent intent = new Intent(this, ActivityThree.class);
            startActivity(intent);
        }
        // Додайте інші кнопки тут, якщо вони використовують цей обробник
    }

    // Методи обробки кліків, викликані через атрибут android:onClick в XML (addPointA, B, C)

    public void addPointA(View v) {
        // Логіка підрахунку поінтів
        display(s);
    }

    public void addPointB(View v) {
        // Логіка підрахунку поінтів
        display(s);
    }

    public void addPointC(View v) {
        // Логіка підрахунку поінтів
        display(s);
    }

    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        if (scoreView != null) {
            scoreView.setText(s);
        }
    }
}