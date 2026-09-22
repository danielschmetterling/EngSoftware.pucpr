public class Cliente {
    private String nome;
    private String CPF;

    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String setCPF(){
        this.CPF = CPF;
    }

    public String getCPF(){
        return CPF;
    }
}