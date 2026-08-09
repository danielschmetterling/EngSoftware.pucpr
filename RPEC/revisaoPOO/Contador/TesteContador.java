public class TesteContador{
    public static void main(String[] args){
        Contador contador = new Contador();
        contador.zerar();
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador.getValor());
    }
}