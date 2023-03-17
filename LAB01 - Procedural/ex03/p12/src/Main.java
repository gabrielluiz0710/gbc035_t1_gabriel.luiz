import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, total = 0, maior = 0;
        int[] a = new int[4];
        float[] p = new float[4];

        System.out.printf("Bolinhas:\n");

        System.out.printf("\nVerde:\n");
        a[0] = sc.nextInt();

        System.out.printf("\nAzul:\n");
        a[1] = sc.nextInt();

        System.out.printf("\nAmarela:\n");
        a[2] = sc.nextInt();

        System.out.printf("\nVermelho:\n");
        a[3] = sc.nextInt();

        for (c = 0; c < 4; c++) {
            total = total + a[c];
        }

        for (c = 0; c < 4; c++) {
            p[c] = a[c] * 100 / total;
            if (p[c] > p[maior]){
                maior = c;
            }
        }

        System.out.printf("Probabilidade:\n");

        System.out.println("Verde: " + p[0]  + "%");
        if (maior == 0) { System.out.println("A maior probabilidade");}

        System.out.println("Azul: " + p[1]  + "%");
        if (maior == 1) { System.out.println("A maior probabilidade");}


        System.out.println("Amarela: " + p[2]  + "%");
        if (maior == 2) { System.out.println("A maior probabilidade");}


        System.out.println("Vermelha: " + p[3]  + "%");
        if (maior == 3) { System.out.println("A maior probabilidade");}



    }
}