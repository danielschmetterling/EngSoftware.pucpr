package Singleton;

public class Principal {
    public static void main(String[] args){
        Singleton conexaoPassageiro = Singleton.getInstancia();
        conexaoPassageiro.buscarVoos("CWB", "HKG");
    }
}