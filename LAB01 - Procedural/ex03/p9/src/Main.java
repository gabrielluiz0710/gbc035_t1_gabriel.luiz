import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, c = 0, d = 0;
        float media = 0;

        while (d == 0){
            System.out.printf("Digite a quantidade de alunos:\n");
            i = sc.nextInt();
            if (i >= 100){
                System.out.println("Erro: quantidade de alunos deve ser menor que 100");
            } else {
                d = 1;
            }
        }


        int[] vet = new int[i];

        while (c<i){
            System.out.printf("Entre com o número %d:\n", c+1);
            vet[c] = sc.nextInt();
            c++;
        }

        System.out.println("Relatório de notas:");
        for (c = 0; c < i; c++) {
            System.out.printf("\nA nota do aluno %d é: %d\n", c+1, vet[c]);
            media = vet[c] + media;
        }
        media = media / i;
        System.out.printf("Média: %f\n", media);

    }
}