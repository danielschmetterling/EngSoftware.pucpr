public class Exemplo3 {
    String msg;
    public Exemplo3(String m){
        msg = m;
    }    
    public void mostrarMensagem(){
        System.out.println(msg);
    }
    public static void main(String[] args){
        Exemplo3 ex3 = new Exemplo3("Texto de exemplo.");
        ex3.mostrarMensagem();
    }
}
