import java.util.ArrayList;

public class Program {
    public static void listarFormas(ArrayList<Forma> l){
        for (Forma f : l){
            System.out.println(f.calcularArea());
        }
    }

    public static void main(String[] args){
//        Forma circulo = new Circulo(20);
//        Forma retangulo = new Retangulo(5,4);


        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(20));
        lista.add(new Retangulo(5,4));
        listarFormas(lista);
    }
}
