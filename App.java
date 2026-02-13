import java.util.Scanner;

public class App {
    public static void main(String [] args) throws Exception{
    Scanner key = new Scanner(System.in);
    System.out.println("Digite un numero: ");
    int numero = key.nextInt();
    excepcion e = new excepcion();
    e.validar(numero);
    key.close();
    }
}
