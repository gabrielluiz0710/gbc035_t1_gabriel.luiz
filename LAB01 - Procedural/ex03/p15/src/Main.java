import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0, i, c;
        int[] a = new int[8];
        int[] b = new int[8];

        System.out.printf("Zerando negativos:\n");

        for (c = 0; c < 8; c++) {
            System.out.printf("\nDigite o valor %d:\n", c+1);
            a[c] = sc.nextInt();
        }

        for (c = 0; c < 8; c++) {
            for (i = 0; i < 8; i++) {
                if ((c != i) && (a[c] == a[i])){
                    b[c] = a[c];
                    d++;
                }
            }
        }

        System.out.printf("\nValores repetidos: \n");

        for (c = 0; c < d; c++) {
            System.out.printf(" %d ", b[c]);
        }


    }
}