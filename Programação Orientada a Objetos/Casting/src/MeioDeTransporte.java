public class MeioDeTransporte {
    protected String modelo;

    public MeioDeTransporte(String modelo){
        this.modelo = modelo;
    }

    public void exibirModelo(){
        System.out.println("Modelo: " + modelo);
    }
}

