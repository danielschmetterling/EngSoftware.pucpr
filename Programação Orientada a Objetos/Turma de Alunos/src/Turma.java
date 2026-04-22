import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> listaAlunos;

    public Turma(){
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAlunos(String nome, int matricula){
        Aluno aluno = new Aluno(nome, matricula);
        listaAlunos.add(aluno);
    }

    public void listarAlunos(){
        for (Aluno aluno : listaAlunos){
            System.out.println("Aluno: " + aluno.getNome() + " Matrícula: " + aluno.getMatricula());
        }
    }
}
