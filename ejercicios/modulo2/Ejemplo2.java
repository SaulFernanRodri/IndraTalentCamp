package ejercicios.modulo2;

import javax.swing.JOptionPane;

public class Ejemplo2 {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        int numero = Integer.parseInt(numeroString);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar.");
        }
    }
}
