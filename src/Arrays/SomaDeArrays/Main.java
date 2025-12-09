package Arrays.SomaDeArrays;

public class Main {

    public static void main(String[] args) {
    int[] valores = new int[5];
    SomaDeVetor vetorSoma = new SomaDeVetor();

    valores[0] = 50;
    valores[1] = 100;
    valores[2] = 200;
    valores[3] = 120;


    System.out.println(vetorSoma.somaDeVetores(valores));
    }

}
