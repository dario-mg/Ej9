package com.example.ej7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Calculator calculator;
    private String currentInput = ""; // Guardar la entrada actual como texto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();
        display = findViewById(R.id.display);
        setUpButtons();
    }

    private void setUpButtons() {
        int[] buttonIds = {
                R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9,
                R.id.buttonPlus, R.id.buttonSubtract, R.id.buttonMultiply, R.id.buttonDivide
        };

        View.OnClickListener buttonListener = v -> {
            Button b = (Button) v;
            currentInput += b.getText().toString(); // Concatenar el número o símbolo
            display.setText(currentInput); // Mostrar en la pantalla
        };

        for (int id : buttonIds) {
            findViewById(id).setOnClickListener(buttonListener);
        }

        Button equalsButton = findViewById(R.id.buttonEquals);
        equalsButton.setOnClickListener(v -> {
            String result = calculator.calculate(currentInput); // Usar la clase Calculator
            display.setText(result);
            currentInput = ""; // Limpiar el input actual
        });

        Button clearButton = findViewById(R.id.buttonClear);
        clearButton.setOnClickListener(v -> {
            currentInput = "";
            display.setText("");
        });
    }
}
