package com.example.ej7;

/**
 * The type Calculator.
 */
public class Calculator {

    /**
     * Calculate string.
     *
     * @param input the input
     * @return the string
     */
    public String calculate(String input) {
        double acumulador = 0;
        char operador = '+'; // Operador inicial
        StringBuilder numeroActual = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                numeroActual.append(c); // Acumula el número
            }

            // Si se encuentra un operador o es el último carácter, realiza la operación
            if ("+-*/".indexOf(c) >= 0 || i == input.length() - 1) {
                if (numeroActual.length() > 0) {
                    double numero = Double.parseDouble(numeroActual.toString());
                    switch (operador) {
                        case '+': acumulador += numero; break;
                        case '-': acumulador -= numero; break;
                        case '*': acumulador = (acumulador == 0) ? numero : acumulador * numero; break; // Multiplicación
                        case '/': acumulador = (acumulador == 0) ? numero : acumulador / numero; break; // División
                        default: acumulador = numero; break; // Para el primer número
                    }
                    numeroActual.setLength(0); // Reinicia el acumulador
                }
                operador = c; // Actualiza el operador
            }
        }

        return String.valueOf(acumulador); // Retorna el resultado final
    }
}
