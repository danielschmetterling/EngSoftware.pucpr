public class Contador{
    private int valor;

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor = valor + 1;
    }    
    
    public int getValor(){
        return valor;
    }
}