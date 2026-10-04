public class ArvoreBinaria {

    No raiz;

    public class No {

        int valor;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    // public void inserir(int valor) {
    //     No novo = new No(valor);

    //     if (raiz == null) {
    //         raiz = new No(valor);
    //         return;
    //     }

    //     No atual = raiz;

    //     while (true) {
    //         if (valor < atual.valor) {
    //             if (atual.esquerda == null) {
    //                 atual.esquerda = novo;
    //                 return;
    //             }
    //             atual = atual.esquerda;
    //         }
    //         if (valor >= atual.valor) {
    //             if (atual.direita == null) {
    //                 atual.direita = novo;
    //                 return;
    //             }
    //             atual = atual.direita;
    //         }
    //     }
    // }

    public void inserir(int valor){
        raiz = inserir(raiz,valor);
    }

    public No inserir(No atual, int valor){
        if (atual == null){
            return new No(valor);
        }
        if (valor < atual.valor){
            atual.esquerda = inserir(atual.esquerda, valor);
        } else {
            atual.direita = inserir(atual.direita, valor);
        }
        return balancear(atual);
    }

    public void preOrdem(No atual) {
        if (atual == null) {
            return;
        }

        System.out.println(atual.valor + ", ");
        preOrdem(atual.esquerda);
        preOrdem(atual.direita);
    }

    public void inOrdem(No atual) {
        if (atual == null) {
            return;
        }

        inOrdem(atual.esquerda);
        System.out.println(atual.valor + ", ");
        inOrdem(atual.direita);
    }

    public void posOrdem(No atual) {
        if (atual == null) {
            return;
        }

        posOrdem(atual.esquerda);
        posOrdem(atual.direita);
        System.out.println(atual.valor + ", ");
    }

    public void buscarValor(int valor) {
        No atual = raiz;
        while (atual != null && valor != atual.valor) {
            if (valor < atual.valor) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }
        if (atual == null) {
            System.out.println("Valor não encontrado.");
        } else {
            System.out.println("Valor encontrado." + atual.valor);
        }
    }

    public void remover(int valor) {
        No atual = raiz;
        No pai = null;

        while (atual != null && atual.valor != valor) {
            pai = atual;
            if (valor < atual.valor) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }
        if (atual == null) {
            return;
        }

        if (atual.esquerda != null && atual.direita != null) {
            No paiSucessor = atual;
            No sucessor = atual.direita;
            while (sucessor.esquerda != null) {
                paiSucessor = sucessor;
                sucessor = sucessor.esquerda;
            }
            atual.valor = sucessor.valor;
            atual = sucessor;
            pai = paiSucessor;
        }

        No filho;
        if (atual.esquerda != null) {
            filho = atual.esquerda;
        } else {
            filho = atual.direita;
        }
        if (pai == null) {
            raiz = filho;
        } else if (pai.esquerda == atual) {
            pai.esquerda = filho;
        } else {
            pai.direita = filho;
        }
    } // Que horror

    public int altura(No no){
        if (no == null){
            return -1;
        }

        int esquerda = altura(no.esquerda);
        int direita = altura(no.direita);
        if (esquerda > direita){
            return 1 + esquerda;
        }
        return 1 + direita;
    }

    public No rotacaoDireita(No raiz){ // Quando Balanceamento da raiz é +2+;
        No novaRaiz = raiz.esquerda;
        raiz.esquerda = novaRaiz.direita;
        novaRaiz.direita = raiz;
        return novaRaiz;
    }

    public No rotacaoEsquerda(No raiz){ // Quando Balanceamento da raiz é -2+;
        No novaRaiz = raiz.direita;
        raiz.direita = novaRaiz.esquerda;
        novaRaiz.esquerda = raiz;
        return novaRaiz;
    }

    public No rotacaoDuplaDireita(No raiz){
        raiz.esquerda = rotacaoEsquerda(raiz.esquerda);
        return rotacaoDireita(raiz);
    }

    public No rotacaoDuplaEsquerda(No raiz){
        raiz.direita = rotacaoDireita(raiz.direita);
        return rotacaoEsquerda(raiz);
    }

    public int fatorBalanceamento(No no){
        if (no == null){
            return 0;
        }

        int esquerda = altura(no.esquerda);
        int direita = altura(no.direita);
        return esquerda - direita;
    }

    public No balancear(No no){
        if (fatorBalanceamento(no) > 1){
            if (fatorBalanceamento(no.esquerda) == -1){
                return rotacaoDuplaDireita(no);
            }
            return rotacaoDireita(no);
        }
        if (fatorBalanceamento(no) < -1){
            if (fatorBalanceamento(no.direita) == +1){
                return rotacaoDuplaEsquerda(no);
            }
            return rotacaoEsquerda(no);
        }
        return no;
    }
    public static void main(String args[]){
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(30);


    }
}
