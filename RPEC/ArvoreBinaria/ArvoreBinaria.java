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

    public void inserir(int valor) {
        No novo = new No(valor);

        if (raiz == null) {
            raiz = new No(valor);
            return;
        }

        No atual = raiz;

        while (true) {
            if (valor < atual.valor) {
                if (atual.esquerda == null) {
                    atual.esquerda = novo;
                    return;
                }
                atual = atual.esquerda;
            }
            if (valor >= atual.valor) {
                if (atual.direita == null) {
                    atual.direita = novo;
                    return;
                }
                atual = atual.direita;
            }
        }
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
}
