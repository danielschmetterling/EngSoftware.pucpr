package Singleton;

public class Principal {
    public static void main(String[] args){
        Singleton conexaoPassageiro = Singleton.getInstance();
        conexaoPassageiro1.buscarVoos("CWB", "HKG");
    }
}