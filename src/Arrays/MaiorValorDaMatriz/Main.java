package Arrays.MaiorValorDaMatriz;

public class Main {
    public static void main(String[] args) {
        int[][] valores={{1,2,3 },
                         {4,10,6},
                         {9,0, 11}};

        Matriz matriz = new Matriz();

        System.out.println(matriz.maiorValorDaDiagonal(valores));

    }
}
