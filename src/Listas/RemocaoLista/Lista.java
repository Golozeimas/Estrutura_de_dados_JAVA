package Listas.RemocaoLista;

public class Lista {
    private Object[] elementos;
    private int tamanho;
    public Lista(int capacidade){
        elementos = new Object[capacidade];
        tamanho = 0;
    }
    void remover(Object[] lista, int indice){
        if(isEmpty(lista)){
            throw new RuntimeException("Não se pode remover uma lista vazia!");
        }

        if(indice < lista.length && indice > 0) {
            System.out.println("Elemento removido: " + elementos[indice]);
            elementos[indice] = null;
            tamanho--;
        }
    }

    static boolean isEmpty(Object[] lista){
        if (lista.length == 0){
            return true;
        }else{
            return false;
        }
    }
}
