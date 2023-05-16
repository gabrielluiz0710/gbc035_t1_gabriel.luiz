public class FaceFriends {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[10];
        int count = 0;

        // Exemplo de inserção de contatos
        contatos[count++] = new Familia("ap1", "Fulano", "fulano@example.com", "01/01/2000", "Pai");
        contatos[count++] = new Amigos("ap2", "Ciclano", "ciclano@example.com", "02/02/2000", 1);
        contatos[count++] = new Trabalho("ap3", "Beltrano", "beltrano@example.com", "03/03/2000", "Colega");

        // Imprimir todos os contatos
        System.out.println("Todos os contatos:");
        for (int i = 0; i < count; i++) {
            contatos[i].imprimirContato();
            System.out.println();
        }

        // Imprimir somente os familiares
        System.out.println("Familiares:");
        for (int i = 0; i < count; i++) {
            if (contatos[i] instanceof Familia) {
                contatos[i].imprimirContato();
                System.out.println();
            }
        }

        // Imprimir somente os amigos
        System.out.println("Amigos:");
        for (int i = 0; i < count; i++) {
            if (contatos[i] instanceof Amigos) {
                contatos[i].imprimirContato();
                System.out.println();
            }
        }

        // Imprimir somente os colegas de trabalho
        System.out.println("Colegas de trabalho:");
        for (int i = 0; i < count; i++) {
            if (contatos[i] instanceof Trabalho) {
                contatos[i].imprimirContato();
                System.out.println();
            }
        }

        // Imprimir os melhores amigos, irmãos e colegas de trabalho
        System.out.println("Melhores amigos, irmãos e colegas de trabalho:");
        for (int i = 0; i < count; i++) {
            if (contatos[i] instanceof Amigos) {
                Amigos amigo = (Amigos) contatos[i];
                if (amigo.getGrau() == 1) {
                    contatos[i].imprimirContato();
                    System.out.println();
                }
            } else if (contatos[i] instanceof Familia) {
                Familia familia = (Familia) contatos[i];
                if (familia.getParentesco().equals("irmão")) {
                    contatos[i].imprimirContato();
                    System.out.println();
                }
            } else if (contatos[i] instanceof Trabalho) {
                Trabalho trabalho = (Trabalho) contatos[i];
                if (trabalho.getTipo().equals("colega")) {
                    contatos[i].imprimirContato();
                    System.out.println();
                }
            }
        }

        // Imprimir os dados de um único contato escolhido pelo índice
        int indiceContato = 1; // índice do contato a ser exibido
        System.out.println("Contato escolhido (índice " + indiceContato + "):");
        if (indiceContato >= 0 && indiceContato < count) {
            Contato contatoEscolhido = contatos[indiceContato];
            if (contatoEscolhido instanceof Familia) {
                System.out.println("Tipo: Família");
            } else if (contatoEscolhido instanceof Amigos) {
                System.out.println("Tipo: Amigos");
            } else if (contatoEscolhido instanceof Trabalho) {
                System.out.println("Tipo: Trabalho");
            }
            contatoEscolhido.imprimirContato();
        } else {
            System.out.println("Índice inválido.");
        }
    }
}