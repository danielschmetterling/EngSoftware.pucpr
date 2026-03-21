public class Exemplo2 {
    public Exemplo2(){
    }
    public void mostrarMensagem(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args){
        Exemplo2 ex2 = new Exemplo2();
        ex2.mostrarMensagem("Teste com Exemplo2");
        Exemplo2 ex3 = new Exemplo2();
        ex3.mostrarMensagem("Outro");
    }
}
