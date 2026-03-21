public class CalculadoraElementar {
    public double valor1;
    public double valor2;
    public double resultado;

    // public CalculadoraElementar(double v1, double v2){
    //     valor1 = 0;
    //     valor2 = 0;
    //     resultado = 0;
    // } Não foi necessário para essa prática.

    public void somar(){
        resultado = valor1 + valor2;
    }
    public void subtrair(){
        resultado = valor1 - valor2;
    }
    public void mostrarResultado(){
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        CalculadoraElementar calc = new CalculadoraElementar();
        calc.valor1 = 20;
        calc.valor2 = 10;

        System.out.println("Soma:");
        calc.somar();
        calc.mostrarResultado();

        System.out.println("Subtração:");
        calc.subtrair();
        calc.mostrarResultado();
    }
}
