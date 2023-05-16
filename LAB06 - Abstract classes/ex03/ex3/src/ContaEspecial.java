class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float lim) {
        super(val, num, pwd);
        limite = lim;
        if (limite == 0)
            convertToContaComum();
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha)
            return false; // senha deve ser válida
        if (estado != 1)
            return false; // conta deve ser ativa
        if (val <= 0)
            return false; // val > 0
        if (val > saldo + limite)
            return false;

        if (val <= saldo) {
            saldo -= val;
        } else {
            limite -= (val - saldo);
            saldo = 0;
        }

        return true;
    }

    private void convertToContaComum() {
        ContaComum contaComum = new ContaComum(saldo, numConta, senha);
        contaComum.estado = this.estado;
        this.saldo = contaComum.saldo;
        this.estado = contaComum.estado;
        this.numConta = contaComum.numConta;
        this.senha = contaComum.senha;
    }
}