public class BancoItau implements IBancoGeral {

@Override
public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
    ContaAbstrata novaConta = null;
    if (tipo.equalsIgnoreCase("Poupanca")) {
        novaConta = new Poupanca(numeroConta, saldoInicial, c);
    } else if (tipo.equalsIgnoreCase("ContaCorrente")) {
        novaConta = new ContaCorrente(numeroConta, saldoInicial, c, 500.0);
    }
    return novaConta;
}

    @Override
    public boolean depositar(ContaAbstrata c, double valor) {
        c.depositar(valor);
        return true;
    }

    @Override
    public boolean sacar(ContaAbstrata c, double valor) {
        if (valor <= c.obterLimite()) {
            c.sacar(valor);
            return true;
        }
        return false;
    }
}