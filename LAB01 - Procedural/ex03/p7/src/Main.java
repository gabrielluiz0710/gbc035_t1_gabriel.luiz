import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, maior;
        float taxa;
        float[] notas = new float[5];
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor >>");

        i=0;

        while (i<5){
            System.out.printf("Entre com a nota do aluno %d:\n", i+1);
            vet[i] = sc.nextInt();
            i++;
        }

        maior = vet[0];
        for (i = 0; i < 5; i++) {
            if (vet[i] > maior){
                maior = vet[i];
            }
        }

        taxa = 100 / maior;

        System.out.println("<< Notas normalizadas >>");

        for (i = 0; i < 5; i++) {
            notas[i] = vet[i] * taxa;
            System.out.printf("\nA nota do aluno %d é: %f\n", i+1, notas[i]);
        }

    }
}