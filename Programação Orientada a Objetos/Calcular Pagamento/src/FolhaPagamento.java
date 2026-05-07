import java.util.ArrayList;

public class FolhaPagamento {
    public static void listarFuncionarios(ArrayList<Funcionario> funcionarios){
        for (Funcionario f : funcionarios){
            f.exibirDados();
        }
    }

    public static void main(String[] args){
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Assalariado("Daniel", 2000));
        lista.add(new Assalariado("Gabriel", 1200));
        lista.add(new Horista("Mateus", 2, 10));
        lista.add(new Horista("Murilo", 8, 20));

        listarFuncionarios(lista);

    }
}
