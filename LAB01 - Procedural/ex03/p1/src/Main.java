import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1,x2,x3,x4,x5,x6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        x1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        x2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        x3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        x4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        x5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        x6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", x1, x2, x3, x4, x5, x6);
    }
}