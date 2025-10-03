package Recursão.fatorial;

import java.util.Scanner;

public class FatorialOuFirbonacci {
    public void fatorialOuFirbonacci() {
        boolean condicao = true;
        while(condicao != false) {
            System.out.println("escolha qual você irá querer:");
            System.out.println("1 - fatorial");
            System.out.println("2 - firbonacci");
            System.out.println("3 - sair do sistema");
            System.out.println("-----------------------------");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("escolha o número para fatorial:");
                    int fatoNumber = scanner.nextInt();
                    System.out.println(fatorial(fatoNumber)); // tá retornando a fatorial, padrão correto
                    break;
                case 2:
                    System.out.println("escolha o número para firbonacci:");
                    int firboNumber = scanner.nextInt();
                    System.out.println(firbonacci(firboNumber));
                    break;
                case 3:
                    condicao = false;
            }
        }
    }

    private int fatorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fatorial(x - 1);
        }
    }

    private int firbonacci(int x) {
        return x;
    }
}