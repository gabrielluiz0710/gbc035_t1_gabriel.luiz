public class Universidade {
    public static void contarEstudantes(Estudante[] estudantes) {
        int grad = 0;
        int mest = 0;
        int dout = 0;
        int pos = 0;
        for (Estudante estudante : estudantes) {
            if (estudante instanceof EstudanteGraduacao) {
                grad++;
            } else if (estudante instanceof EstudanteMestrado) {
                mest++;
            } else if (estudante instanceof EstudanteDoutorado) {
                dout++;
            } else if (estudante instanceof EstudantePosGrad) {
                pos++;
            }
        }
        System.out.println("A universidade possui " + grad + " estudantes de graduação, " + mest + " estudantes de mestrado, " + dout + " estudantes de doutorado e " + pos + " estudantes de pós graduação.");
    }
}
