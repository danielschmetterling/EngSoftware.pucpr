public class Retangulo extends Forma{
    public Retangulo(int altura, int largura){
        super(altura, largura);
    }
    
    @Override
    public int CalcularArea(){
        return altura * largura;
    }
}