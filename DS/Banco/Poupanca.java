public class Poupanca extends ContaAbstrata {
    
    public Poupanca(String numeroConta, double saldo, Cliente cliente){
        super(numeroConta, saldo, cliente);
    }

    @Override
    public double obterLimite(){
        return saldo;
    }
}