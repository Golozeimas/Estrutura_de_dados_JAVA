package Listas.ListaEncadeada;

public class Node {
    private Aluno elemento;
    private Node proximo;

    public Node(Aluno aluno, Node n){
        elemento = aluno;
        proximo = n;
    }
}
