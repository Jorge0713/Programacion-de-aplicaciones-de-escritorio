package Practica_1;

import Actividad_2.excepcion;

/*Escriba y ejecute una clase que tenga un método principal que:
a. Lance un objeto de tipo Exception dentro de un bloque try. Asigne a la
excepción un mensaje de error en su constructor
b. En la cláusula catch, imprima el mensaje de la excepción */
public class App {
    public static void main(String[] agrs) {
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            /*
             * Imprima el stack trace ´para la excepción
             * d. Agregue una cláusula finally, que imprime un mensaje para indicar que se
             * ha alcanzado.
             */
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
