public class Exemplo6 {
    String msg;
    public Exemplo6(){
        msg = "";
    }
    public void mostrarMsg(){
        System.out.println(msg);
    }
    public static void main(String[] args){
        System.out.println("Teste de argumentos ");
        System.out.println("Argumento 1: " + args[0]);

        Exemplo6 ex = new Exemplo6();
        ex.msg = args[0];
        ex.mostrarMsg();
    }
}


// É executado no terminal java Exemplo6 Teste