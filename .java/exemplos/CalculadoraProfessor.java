public class Calculadora {

    private double valor1;
    private double valor2;
    private double resultado;

    private void setarValor1AposOperacao(){
        valor1 = resultado;
    }

    public Calculadora(double v1, double v2){
        valor1 = v1;
        valor2 = v2;
        resultado = 0.0;
    }

    public void somar(){
        resultado = valor1 + valor2;
        setarValor1AposOperacao();
    }

    public void subtrair(){
        resultado = valor1 - valor2;
        setarValor1AposOperacao();
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
        Calculadora c1 = new Calculadora(10.0, 15.0);
        Calculadora b1 = new Calculadora(10.0, 35.0);
        c1.somar();
        c1.mostrar();
        c1.subtrair();
        c1.mostrar();
        
        b1.subtrair();
        b1.mostrar();
    }

}