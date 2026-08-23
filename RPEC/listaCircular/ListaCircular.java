/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class ListaEncadeada {
    // Classe interna para representar um nó da lista
    class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó

        // Construtor do nó
        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No inicio = null; // Referência para o primeiro nó da lista

    // Método para inserir um elemento no final da lista
    public void insereElemento(int elemento) {
        No novoNo = new No(elemento); // Cria um novo nó com o elemento fornecido

        if (inicio == null) {
            // Caso a lista esteja vazia, o início aponta para o novo nó
            inicio = novoNo;
            novoNo.proximo = inicio;
        } else {
            // Caso contrário, percorre a lista até o final
            No atual = inicio;
            while (atual.proximo != inicio) {
                 atual = atual.proximo; // Avança para o próximo nó
            }
            atual.proximo = novoNo;
            novoNo.proximo = inicio; // Insere o novo nó no final da lista
        }
    }

    public void removeElemento(int elemento){
        if (inicio == null){
            return;
        }
        if (inicio.dado == elemento && inicio.proximo == inicio){ // Só tem o Nó na lista.
            inicio = null;
            return;
        }
        if (inicio.dado == elemento){ // O Nó é o primeiro.
            No atual = inicio;
            while (atual.proximo != inicio){
                atual = atual.proximo;
            }
            inicio = inicio.proximo;
            atual.proximo = inicio;
            return;
        }
        No atual = inicio;
        while (atual.proximo != inicio){ // Nó tá depois do primeiro.
            if (atual.proximo.dado == elemento){
                atual.proximo = atual.proximo.proximo;
                return;
            }
            atual = atual.proximo;
        }
    }

    // Método para exibir os elementos da lista (para teste)
    public void exibeLista() {
        No atual = inicio;
        System.out.print("Lista: ");
        System.out.print(atual.dado + " ");
        atual = atual.proximo;
        while (atual != inicio) {
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


