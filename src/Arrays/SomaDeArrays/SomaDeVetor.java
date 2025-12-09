package Arrays.SomaDeArrays;

public class SomaDeVetor {
    int somaDeVetores(int[] vetor){
        int vetorDeSomas = 0;
        if (vetor.length == 1){
            return vetor[0];
        }
        for(int i = 0; i < vetor.length; i++){
            vetorDeSomas += vetor[i];
        }
        return vetorDeSomas;
    }
}
