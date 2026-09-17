public abstract class ContaAbstrata {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public abstract double obterLimite();

    public ContaAbstrata(Cliente cliente, String numeroConta, double saldo){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public void sacar(double valor){
        this.saldo = saldo - valor;
    }
}