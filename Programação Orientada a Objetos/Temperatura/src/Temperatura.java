public class Temperatura {
    private double valor;

    public void setValor(double valor) {
        if (valor < -273){
            System.out.println("Erro: A temperatura não pode ser menor que o zero absoluto (-273ºC)!");
            this.valor = -273;
        }
        else{
            this.valor = valor;
        }
    }


    // O exercício exigia o uso do getValor e exibirTemperatura, mas apenas um deles é necessário.
    public double getValor() {
        return valor;
    }

    public void exibirTemperatura(){
        System.out.println("A temperatura é " + valor + " ºC");
    }

    public static void main(String[] args){
        Temperatura temp1 = new Temperatura();
        Temperatura temp2 = new Temperatura();

        System.out.println("Temperatura 1:");
        temp1.setValor(25);
        temp1.exibirTemperatura();

        System.out.println();

        System.out.println("Temperatura 2:");
        temp2.setValor(-300);
        temp2.exibirTemperatura();
    }
}
