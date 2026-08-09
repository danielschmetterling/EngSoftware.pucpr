public class Triangulo implements Forma{
    private int altura;
    private int largura;
    
    public Triangulo(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public int CalcularArea(){
        return (altura * largura) / 2;
    }
}