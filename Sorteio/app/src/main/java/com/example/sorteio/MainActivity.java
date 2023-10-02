package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView resultadoText;
    EditText numero1txt;
    EditText numero2txt;
    Button sorteiaButton;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoText = findViewById(R.id.resultadoText);
        numero1txt = findViewById(R.id.numero1txt);
        numero2txt = findViewById(R.id.numero2txt);
        sorteiaButton = findViewById(R.id.sorteiaButton);

        random = new Random();
    }

    public void sorteia(View v) {
        String minString = numero1txt.getText().toString();
        String maxString = numero2txt.getText().toString();

        if (!minString.isEmpty() && !maxString.isEmpty()) {
            int minValue = Integer.parseInt(minString);
            int maxValue = Integer.parseInt(maxString);

            if (minValue <= maxValue) {
                int randomValue = random.nextInt(maxValue-minValue+1)+minValue;
                resultadoText.setText(String.valueOf(randomValue));
            } else {
                resultadoText.setText("O valor mínimo deve ser menor ou igual que o valor máximo.");
            }
        } else {
            resultadoText.setText("Insira valores que sejam válidos.");
        }
    }
}