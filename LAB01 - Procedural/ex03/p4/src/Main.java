import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        i=0;

        while (i<6){
            System.out.printf("Entre com o número %d:\n", i+1);
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0){
                i++;
            } else {
                System.out.println("Erro: Valor inválido");
            }
        }

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }
    }
}