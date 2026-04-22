public class Teste {
    public static void main(String[] args){
        Turma TurmaB = new Turma();

        TurmaB.adicionarAlunos("Daniel Felix", 123);
        TurmaB.adicionarAlunos("Gabriel", 321);

        System.out.println("Alunos da Turma:");
        TurmaB.listarAlunos();
    }
}
