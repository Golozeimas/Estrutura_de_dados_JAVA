package Listas.ListaEncadeada;

public class ListaSimplesEncadeada {
    protected Node cabeca;
    protected int tamanho;
    public ListaSimplesEncadeada(){
        cabeca = null;
        tamanho = 0;
    }

void adicionaPrimeiroElemento(Aluno aluno){
        Node novoNo = new Node(aluno, this.cabeca);
        // teria que fazer um metodo que adicione o proximo nó
        novoNo = cabeca;
        this.cabeca = novoNo;
        tamanho++;
    }
}
