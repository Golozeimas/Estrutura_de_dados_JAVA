package Arrays.MaiorValorDaMatriz;

public class Matriz {
    int maiorValorDaDiagonal(int[][] matriz){
        int valor = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j) {
                    if (matriz[i][j] != matriz[0][0]) {
                        if (matriz[i - 1][j - 1] < matriz[i][j]) {
                            valor = matriz[i][j];
                        }
                    }else{
                        valor = matriz[i][j];
                    }
                }
            }
        }
        return valor;
    }
}
