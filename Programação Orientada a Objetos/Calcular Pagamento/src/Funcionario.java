abstract class Funcionario{
    private String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public abstract double calcularPagamento();

    public void exibirDados(){
        System.out.println("Funcionário: " + getNome() + " | " + "Pagamento: " + calcularPagamento());
    }
}