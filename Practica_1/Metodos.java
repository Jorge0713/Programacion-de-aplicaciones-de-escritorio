package Practica_1;

import Actividad_2.excepcion;

public class Metodos {
    public static void main(String[] args) {
        try {
            Metodob();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void Metodoa() throws Exception {
        throw new Exception("Excepcion generada por el metodo A");
    }

    public static void Metodob() throws Exception {
        try {
            Metodoa();
        } catch (Exception e) {
            throw new Exception("Excepcion generada por el metodo B");
        }
    }
}
