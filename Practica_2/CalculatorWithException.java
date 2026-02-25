package Practica_2;
public class CalculatorWithException {

    public static void main(String[] argumentos) {

        if (argumentos.length != 3) {
            System.out.println("Uso: java CalculadoraConExcepcion numero1 operador numero2");
            return;
        }

        try {
            int numero1 = Integer.parseInt(argumentos[0]);
            int numero2 = Integer.parseInt(argumentos[2]);
            char operador = argumentos[1].charAt(0);

            int resultado = 0;

            // Realizar la operación
            if (operador == '+') {
                resultado = numero1 + numero2;
            } else if (operador == '-') {
                resultado = numero1 - numero2;
            } else if (operador == '*') {
                resultado = numero1 * numero2;
            } else if (operador == '/') {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Operador no válido.");
                return;
            }

            // Mostrar resultado
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: los operandos deben ser números.");
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }
    }
}