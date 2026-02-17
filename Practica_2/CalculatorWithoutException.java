package Practica_2;
public class CalculatorWithoutException {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Use: java Calculator num1 operator num2");
            return;
        }

        String s1 = args[0];
        String s2 = args[2];

        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isDigit(s1.charAt(i))) {
                System.out.println("First operand is not numeric.");
                return;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!Character.isDigit(s2.charAt(i))) {
                System.out.println("Second operand is not numeric.");
                return;
            }
        }

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        char operator = args[1].charAt(0);

        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    }
}
