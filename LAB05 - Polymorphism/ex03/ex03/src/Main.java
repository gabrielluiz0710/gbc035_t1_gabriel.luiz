public class Main {

    public static void main(String[] args) {
        Estudante[] alunos = new Estudante[6];
        alunos[0] = new EstudanteGraduacao("João", "Rua A, 123", "TCC de João");
        alunos[1] = new EstudanteMestrado("Maria", "Rua B, 456", "Ciência da Computação", "Redes de Computadores", "acadêmico", "Dissertação de Maria");
        alunos[2] = new EstudanteDoutorado("Pedro", "Rua C, 789", "Engenharia Elétrica", "Sistemas de Potência", "Tese de Pedro");
        alunos[3] = new EstudantePosGrad("Lucas", "Rua D, 101", "Física", "Teoria Quântica");
        alunos[4] = new EstudanteMestrado("Ana", "Rua E, 111", "Matemática", "Álgebra", "profissional", "Dissertação de Ana");
        alunos[5] = new EstudanteGraduacao("Carla", "Rua F, 222", "TCC de Carla");

        Universidade.contarEstudantes(alunos);

        System.out.println();

        for (Estudante estudante : alunos) {
            System.out.println(estudante.getNome());
            if (estudante instanceof EstudanteDoutorado) {
                EstudanteDoutorado doutorado = (EstudanteDoutorado) estudante;
                System.out.println("- Doutorado em " + doutorado.getFormacao() + ", linha de pesquisa em " + doutorado.getLinhaDePesquisa() + ", com a tese '" + doutorado.getTituloTese() + "'");
            }
            System.out.println();
        }

        Estudante[] estudantes = new Estudante[4];
        estudantes[0] = new EstudanteGraduacao("João", "Rua A, 123", "TCC de João");
        estudantes[1] = new EstudanteGraduacao("João", "Rua B, 456", "Título do TCC");
        estudantes[2] = new EstudanteMestrado("Ana", "Rua C, 789", "Mestrado em Ciência da Computação",
                "Inteligência Artificial", "Profissional", "Título da Dissertação");
        estudantes[3] = new EstudanteDoutorado("Pedro", "Rua D, 012", "Doutorado em Engenharia de Software",
                "Engenharia de Software e Métodos Formais", "Título da Tese");


        // Para que o método print(boolean) possa ser utilizado em um polimorfismo tendo como base um vetor da classe Estudante,
        // é necessário que todos os subtipos de Estudante implementem esse método.
        //
        // Para permitir que o método seja utilizado em polimorfismo para todos os subtipos de Estudante,
        // podemos adicionar uma implementação padrão do método print(boolean) na classe abstrata Estudante que
        // será herdada por todos os seus subtipos.
        for (Estudante e : estudantes) {
            e.print(false);
        }



    }

}
