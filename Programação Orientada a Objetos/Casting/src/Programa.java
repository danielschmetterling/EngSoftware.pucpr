import java.util.ArrayList;

public class Programa {
    public static void main(String[] args){
        ArrayList<MeioDeTransporte> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Civic"));
        veiculos.add(new Bicicleta("Caloi Elite", true));
        veiculos.add(new Carro("Corolla"));

        for (MeioDeTransporte t : veiculos){
            t.exibirModelo();

            if (t instanceof Carro){
//                Carro c = (Carro) t;
//                c.acelerar();
                ((Carro) t).acelerar(); //Mais interessante e limpo.
            } else if (t instanceof Bicicleta) {
                Bicicleta b = (Bicicleta) t;
                b.pedalar();
            }
            System.out.println("----------------");
        }
    }
}
