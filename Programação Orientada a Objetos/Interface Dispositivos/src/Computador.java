public class Computador implements Dispositivo {
    @Override
    public void ligar(){
        System.out.println("Computador ligado.");
    }
    public void desligar(){
        System.out.println("Computador desligado.");
    }
}
