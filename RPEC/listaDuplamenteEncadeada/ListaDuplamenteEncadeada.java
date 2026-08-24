public class ListaDuplamenteEncadeada {
    // Classe interna para representar um nó da lista
    class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó
        No anterior;

        // Construtor do nó
        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
            this.anterior = null;
        }
    }

    No inicio = null; // Referência para o primeiro nó da lista

    // Método para inserir um elemento no final da lista
    public void insereElemento(int elemento) {
        No novoNo = new No(elemento); // Cria um novo nó com o elemento fornecido

        if (inicio == null) {
            // Caso a lista esteja vazia, o início aponta para o novo nó
            inicio = novoNo;
        } else {
            // Caso contrário, percorre a lista até o final
            No atual = inicio;
            while (atual.proximo != null) {
                 atual = atual.proximo; // Avança para o próximo nó
            }
            atual.proximo = novoNo; // Insere o novo nó no final da lista
            atual.proximo.anterior = atual;
        }
    }

    public void removeElemento(int elemento){
        if (inicio == null){
            return;
        }
        if (inicio.dado == elemento){
            inicio = inicio.proximo;
            return;
        }
        No atual = inicio;
        while (atual.proximo != null){
            if (atual.proximo.dado == elemento){
                if (atual.proximo.proximo == null){
                    atual.proximo.anterior = null;
                    atual.proximo = null;
                    return;
                }
                atual.proximo = atual.proximo.proximo;
                atual.proximo.anterior = atual;
                return;
            }
            atual = atual.proximo;
        }
    }

    // Método para exibir os elementos da lista (para teste)
    public void exibeLista() {
        No atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; // Move para o próximo nó
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Inserindo elementos na lista
        lista.insereElemento(10);
        lista.insereElemento(20);
        lista.insereElemento(30);

        // Exibindo os elementos da lista
        lista.exibeLista(); // Deve exibir: Lista: 10 20 30
        RPEC novo = new RPEC();
        novo.show();
    }
}


