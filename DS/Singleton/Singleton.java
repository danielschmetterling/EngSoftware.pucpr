package Singleton;

public class Singleton {
    private static Singleton instancia;
    private String chaveGds;

    private Singleton(){
        this.chaveGds = "Chave123";
    }

    public static Singleton getInstancia(){
        if (instancia == null){
            instancia = new Singleton();
        }
    }
    return instancia;

    public void buscarVoos(String origem, String destino){
        System.out.println("Buscando voos de " + origem + " para " + destino + " usando a chave: " + this.chaveGds);
    }
}