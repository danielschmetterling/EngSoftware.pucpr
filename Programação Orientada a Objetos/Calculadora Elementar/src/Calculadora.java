public class Calculadora {
    private int valor1;
    private int valor2;
    private int resultado;

    public Calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void somar(){
        resultado = valor1 + valor2;
    }

    public void subtrair(){
        resultado = valor1 - valor2;
    }

    public void mostrarResultado() {
        System.out.println("O resultado é: " + resultado);
    }

    public static void main(String[] args){
        Calculadora calc = new Calculadora(10, 20);

        System.out.println("Soma:");
        calc.somar();
        calc.mostrarResultado();

        System.out.println("Subtrair:");
        calc.subtrair();
        calc.mostrarResultado();
    }
}