import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, menor, maior;
        float media;
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor >>");

        i=0;
        media = 0;

        while (i<5){
            System.out.printf("Entre com o número %d:\n", i+1);
            vet[i] = sc.nextInt();
            i++;
        }

        maior = vet[0];
        menor = vet[0];
        System.out.println("Os valores lidos são:");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
            media = vet[i] + media;
            if (vet[i] > maior){
                maior = vet[i];
            }
            if (vet[i] < menor){
                menor = vet[i];
            }
        }
        media = media / 5;
        System.out.printf("\nMaior valor: %d\n", maior);
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Média: %f\n", media);

    }
}