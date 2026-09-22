public class Teste {
    public static void main(String[] args) {
        IBancoGeral banco = new BancoItau();
        Cliente cliente = new Cliente("Robson", "123.456.789-00");

        ContaAbstrata poupanca = banco.abrirConta(cliente, "101", 100.0, "Poupanca");
        ContaAbstrata corrente = banco.abrirConta(cliente, "202", 200.0, "ContaCorrente");

        banco.depositar(poupanca, 50.0);
        banco.sacar(poupanca, 30.0);

        banco.depositar(corrente, 100.0);
        banco.sacar(corrente, 50.0);

        System.out.println("Saldo da Poupanca: " + poupanca.getSaldo());
        System.out.println("Saldo da Conta Corrente: " + corrente.getSaldo());
    }
}