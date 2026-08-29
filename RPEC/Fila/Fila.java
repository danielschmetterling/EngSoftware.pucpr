public class Fila{
    private int primeiro;
    private int ultimo;
    private int dados[];
    private int capacidade;
    private int tamanho;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.primeiro = 0;
        this.ultimo = -1;
        this.capacidade = 0;
    }

    public boolean Cheia(){
        if (capacidade == tamanho){
            return true;
        } else {
            return false;
        }
    }

    public boolean Vazia(){
        if (capacidade == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Inserir(int elemento){
        if (Cheia() == true) {
            System.out.println("Fila Cheia.");
        } else {
            ultimo = ultimo + 1
            if (ultimo == tamanho) {
                ultimo = 0;
            }
            dados[ultimo] = elemento;
            capacidade = capacidade + 1;
        }
    }

    public void Remover(){
        if (Vazia() == true){
            System.out.println("Está vazia.")
        } else {
            primeiro = primeiro + 1;
            if (primeiro == tamanho) {
                primeiro = 0;
            }
            capacidade = capacidade - 1;
        }
    }

    public void Imprimir() {
        if (Vazia() == true){
            System.out.println("Está vazia.");
        } else {
            int indice = primeiro;
            int contador = 0;
            while (contador < capacidade) {
                System.out.println(dados[indice]);
                indice = indice + 1;
                if (indice == tamanho) {
                    indice = 0;
                }
                contador = contador + 1;
            }
        }
    }
}