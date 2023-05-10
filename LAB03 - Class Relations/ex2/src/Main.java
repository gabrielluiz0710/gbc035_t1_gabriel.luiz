public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Ciência da Computação", 4000);
        Disciplina disciplina1 = new Disciplina("Programação I", 80);
        Disciplina disciplina2 = new Disciplina("Programação II", 80);
        curso1.adicionarDisciplina(disciplina1);
        curso1.adicionarDisciplina(disciplina2);

        System.out.println("Nome do curso: " + curso1.getNome());
        System.out.println("Carga horária do curso: " + curso1.getCargaHoraria());
        System.out.println("Disciplinas do curso:");
        for (Disciplina disciplina : curso1.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome() + " (" + disciplina.getCargaHoraria() + " horas)");
        }
    }
}