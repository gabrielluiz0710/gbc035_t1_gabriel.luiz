import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, menor, maior, p1, p2;
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
        p1 = 0;
        p2 = 0;
        System.out.println("Os valores lidos são:");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
            media = vet[i] + media;
            if (vet[i] > maior){
                maior = vet[i];
                p1 = i;
            }
            if (vet[i] < menor){
                menor = vet[i];
                p2 = i;
            }
        }
        media = media / 5;
        System.out.printf("\nMaior valor: %d, localizado na posição %d do vetor\n", maior, p1);
        System.out.printf("Menor valor: %d, localizado na posição %d do vetor\n", menor, p2);
        System.out.printf("Média: %f\n", media);

    }
}