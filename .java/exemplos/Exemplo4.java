public class Exemplo4 {
    String msg;
    public Exemplo4(){
        msg = "";
    }
    public static void main(String[] args){
        Exemplo4 e1 = new Exemplo4();
        e1.msg="texto";
        // Exemplo4 e2 = new Exemplo4();
        // e2.msg="texto";
        Exemplo4 e2;
        e2=e1;
        System.out.println("Comparando os objetos: ");
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
        // Por algum motivo está dando false (true?).
    }
}
