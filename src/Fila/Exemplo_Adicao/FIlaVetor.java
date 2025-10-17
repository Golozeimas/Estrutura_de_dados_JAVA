package Fila.Exemplo_Adicao;

class FilaVetor {
    int[] vetor = new int[4];

    int f = 0;
    int r = 0;

    void add (int n){
        vetor[f] = n;
        r++;
        r = r % vetor.length;
    }
}
