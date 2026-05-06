public class Circulo extends Forma{
    private double raio;
    double pi = Math.PI;

    public Circulo(){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * pi;
    }
}
