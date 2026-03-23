public class Calculadora {

    private double valor1;
    private double valor2;
    private double resultado;

    public Calculadora(double v1, double v2){
        valor1 = v1;
        valor2 = v2;
        resultado = 0.0;
    }

    public void somar(){
        resultado = valor1 + valor2;
    }
    public void subtrair(){
        resultado = valor1 - valor2;
    }
    public void mostrar(){
        System.out.println(resultado);
    }

    // Não é interessante pois, nem todos querem somar e já mostrar o resultado. Isso é apenas um método.
    // public void somar(){
    //     resultado = valor1 + valor2;
    //     mostrar();
    // }

    public static void main(String[] args){
        Calculadora c = new Calculadora(10.0, 15.0);
        c.somar();
        c.mostrar();
        c.subtrair();
        c.mostrar();
    }

}