class ContaComum extends ContaCorrente {
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha)
            return false; // senha deve ser válida
        if (estado != 1)
            return false; // conta deve ser ativa
        if (val <= 0)
            return false; // val > 0
        if (val > saldo)
            return false;

        saldo -= val;
        if (saldo == 0)
            estado = 2; // torna conta inativa
        return true;
    }
}