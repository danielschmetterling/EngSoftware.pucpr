public class ContaBancaria {
    private double saldo;

    public ContaBancaria(){
        saldo = 0.0;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.depositar(2000);
        conta2.depositar(3000);

        conta1.sacar(200);
        conta2.sacar(300);

        System.out.println("Saldo da Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da Conta 2: " + conta2.getSaldo());
    }
}
