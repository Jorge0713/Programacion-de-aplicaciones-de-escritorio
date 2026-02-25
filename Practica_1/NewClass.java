package Practica_1;

/*. Escriba y ejecute una clase que contenga un método que produzca la nueva
excepción. Recuerde indicar que el método arroja una excepción. Escriba un
método principal que:
a. Crea una instancia del objeto,
b. Invoca el método que genera la excepción,
c. Controla la excepción iniciada imprimiendo el mensaje de error en la
consola */
public class NewClass {

    public static void main(String[] args)  {
        NewException ne = new NewException("Error::");
        try {
            metodh();
        } catch (NewException e) {  
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void metodh() throws NewException {
        throw new NewException("Excepcion generada por el metodo");
    }

}
