import java.util.ArrayList;

public class Programa {
    public static void listarDispositivos(ArrayList<Dispositivo> l){
        for (Dispositivo d : l){
            d.ligar();
            d.desligar();
        }
    }
    public static void main(String[] args){
//        Dispositivo tv = new Televisao();
//        Dispositivo pc = new Computador();

        ArrayList<Dispositivo> lista = new ArrayList<>();
        lista.add(new Televisao());
        lista.add(new Computador());
        listarDispositivos(lista);
    }
}
