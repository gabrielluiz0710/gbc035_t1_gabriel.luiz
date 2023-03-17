import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, c, qtd;
        int a[] = new int[8];

        for(i = 0; i < 8; i++){
            System.out.println("Digite um número: ");
            a[i] = sc.nextInt();
        }

        boolean[] b = new boolean[8];

        for(i = 0; i < 8; i++){
            if(!b[i]) {
                qtd = 1;
                for(c = i + 1; c < 8; c++){
                    if(a[i] == a[c]){
                        qtd++;
                        b[c] = true;
                    }
                }

                System.out.println(a[i] + " aparece " + qtd + " vezes"  );

            }
        }


    }
}