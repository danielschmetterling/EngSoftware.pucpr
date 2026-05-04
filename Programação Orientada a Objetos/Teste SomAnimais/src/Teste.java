import java.util.ArrayList;

public class Teste {

    public static void ouvirAnimais(ArrayList<Pet> l){
        for (Pet p : l){
            p.fazerSom();
        }
    }

    public static void main(String[] args){
        Pet latido = new Cachorro();
        latido.fazerSom();

        Pet miado = new Gato();
        miado.fazerSom();

        Pet papagaias = new Papagaio();
        papagaias.fazerSom();

        ArrayList<Pet> lista = new ArrayList<>();

        lista.add(new Cachorro());
        lista.add(new Gato());
        lista.add(new Papagaio());
        ouvirAnimais(lista);


    }
}
