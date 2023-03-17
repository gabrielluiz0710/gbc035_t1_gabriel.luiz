import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i;
        double media, desvio, e = 0.0, soma = 0.0;
        int vet[] = new int[5];

        for(i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            vet[i] = ler.nextInt();

            soma += vet[i];

        }

        media = soma/5;

        for(i = 0; i < 5; i++){
            e += (vet[i] - media)*(vet[i] - media);
        }

        desvio = Math.sqrt(e/4);

        System.out.println("A média dos números é " + media + " e o desvio padrão é " + desvio);

    }
}
