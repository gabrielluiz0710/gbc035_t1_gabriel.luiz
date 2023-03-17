import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int[] a = new int[3];
        int[] b = new int[3];
        int[] vetc = new int[3];

        System.out.printf("Subtração de vetores:\n");

        for (c = 0; c < 3; c++) {
            System.out.printf("\nDigite o valor %d de A:\n", c+1);
            a[c] = sc.nextInt();
        }

        for (c = 0; c < 3; c++) {
            System.out.printf("\nDigite o valor %d de B: \n", c+1);
            b[c] = sc.nextInt();
        }

        for (c = 0; c < 3; c++) {
            vetc[c] = a[c] - b[c];
        }


        System.out.printf("O vetor C, definido como C = A-B é (%d, %d, %d)\n", vetc[0], vetc[1], vetc[2]);

    }
}