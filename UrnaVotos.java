import java.util.Scanner;

public class UrnaVotos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int totalVotos = 0;

        System.out.println("Ingrese el voto (1-3). Ingrese 0 para terminar:");
        voto = sc.nextInt();

        while (voto != 0) {

            if (voto == 1) {
                candidato1++;
                totalVotos++;
            } else if (voto == 2) {
                candidato2++;
                totalVotos++;
            } else if (voto == 3) {
                candidato3++;
                totalVotos++;
            } else {
                System.out.println("Voto invalido");
            }

            System.out.println("Ingrese otro voto (0 para terminar):");
            voto = sc.nextInt();
        }

        if (totalVotos > 0) {
            double p1 = (candidato1 * 100.0) / totalVotos;
            double p2 = (candidato2 * 100.0) / totalVotos;
            double p3 = (candidato3 * 100.0) / totalVotos;

            System.out.println("Porcentaje candidato 1: " + p1 + "%");
            System.out.println("Porcentaje candidato 2: " + p2 + "%");
            System.out.println("Porcentaje candidato 3: " + p3 + "%");
        } else {
            System.out.println("No hubo votos.");
        }

        sc.close();
    }
}
