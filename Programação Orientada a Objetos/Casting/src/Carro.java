public class Carro extends MeioDeTransporte{

    public Carro(String modelo){
        super(modelo);
    }

    public void acelerar(){
        System.out.println("Carro acelerando.");
    }
}
