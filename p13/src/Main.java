import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int[] a = new int[5];

        System.out.printf("Zerando negativos:\n");

        for (c = 0; c < 5; c++) {
            System.out.printf("\nDigite o valor %d:\n", c+1);
            a[c] = sc.nextInt();
            if (a[c] < 0){
                a[c] = 0;
            }
        }

        System.out.printf("\nZerando os negativos, obtém-se: ");
        for (c = 0; c < 5; c++) {
            System.out.printf("%d ", a[c]);
        }

    }
}