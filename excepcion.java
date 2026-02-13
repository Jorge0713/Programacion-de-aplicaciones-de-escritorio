public class excepcion {
    public void validar(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("El numero es impar");
        } else {
            System.out.println("El numero es par");
        }
    }
}