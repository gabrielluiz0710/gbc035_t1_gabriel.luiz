import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, par = 0, impar = 0;
        int[] a = new int[5];
        int[] vetb = new int[5];
        int[] vetc = new int[5];

        System.out.printf("Pares e ímpares:\n");

        System.out.printf("\nDigite o valor %d:\n", c+1);
        a[c] = sc.nextInt();

        for (c = 0; c < 5; c++) {
            if (a[c] % 2 == 0){
                vetb[par] = a[c];
                par++;
            } else {
                vetc[impar] = a[c];
                impar++;
            }
        }

        System.out.printf("Ímpares: ");
        for (c = 0; c < impar; c++) {
            System.out.printf("%d ", vetc[c]);
        }

        System.out.printf("Pares: ");
        for (c = 0; c < par; c++) {
            System.out.printf("%d ", vetb[c]);
        }

    }
}