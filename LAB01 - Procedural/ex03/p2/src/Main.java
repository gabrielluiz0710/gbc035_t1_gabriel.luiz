import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x[] = new int [6];
        int i;
        i = 0;

        System.out.println("<< Listando um vetor >>");
        for (i=0; i<6; i++){
            System.out.printf("Entre com o número %d:", i+1);
            x[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (i=0; i<6; i++){
            System.out.printf("%d ", x[i]);
        }

    }
}