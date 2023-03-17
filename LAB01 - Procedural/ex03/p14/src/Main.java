import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[10000];
        char[] classe = new char[10000];
        float[] cra = new float[10000];
        int i;

        System.out.printf("Universidade:\n");

        System.out.println("Quantos alunos serão cadastrados: ");
        i = sc.nextInt();

        for(int c = 0; c < i; c++){
            System.out.println("Numero do aluno : ");
            numero[c] = sc.nextInt();
            System.out.printf("Classe social do aluno %d: \n", numero[c]);
            classe[c] = sc.next().charAt(0);
            System.out.printf("Entre com o CRA do aluno %d: \n", numero[c]);
            cra[c] = sc.nextFloat();
        }

        System.out.println("Alunos Cadastrados: ");

        for(int c = 0; c < i; c++){
            System.out.printf("Número: %d Classe: %c CRA: %.2f\n", numero[c], classe[c], cra[c]);
        }

    }
}