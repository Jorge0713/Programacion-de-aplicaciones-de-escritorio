package Practica_2;
public class CalculatorWithException {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Use: java Calculator num1 operator num2");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            char operator = args[1].charAt(0);

            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else {
                System.out.println("Invalid operator");
                return;
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: operands must be numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero.");
        }
    }
}