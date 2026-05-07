public class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, double salarioMensal){
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento(){
        return salarioMensal;
    }
}
