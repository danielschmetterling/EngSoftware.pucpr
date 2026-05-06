public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
}
