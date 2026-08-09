public class Triangulo extends Forma{
    public Triangulo(int altura, int largura){
        super(altura,largura);
    }
    
    @Override
    public int CalcularArea(){
        return (altura * largura) / 2;
    }
}