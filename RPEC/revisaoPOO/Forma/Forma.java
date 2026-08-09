public abstract class Forma{
    protected int altura;
    protected int largura;

// Não funcionou com private

    public Forma(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
    }

    public abstract int CalcularArea();
}