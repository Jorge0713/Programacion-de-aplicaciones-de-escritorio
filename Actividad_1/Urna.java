package Actividad_1;
import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] votos = new int[3]; // 3 candidatos
        int voto;
        int total = 0;

        System.out.println("Ingrese voto (1-3). 0 para terminar:");
        voto = sc.nextInt();

        while (voto != 0) {

            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
                total++;
            } else {
                System.out.println("Voto invalido");
            }

            voto = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            double porcentaje = (votos[i] * 100.0) / total;
            System.out.println("Candidato " + (i + 1) + ": " + porcentaje + "%");
        }

        sc.close();
    }
}

