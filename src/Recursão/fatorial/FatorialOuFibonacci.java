package Recursão.fatorial;

import java.util.Scanner;

public class FatorialOuFibonacci {

    public void fatorialOuFibonacci() {
        boolean condicao = true;
        while(condicao != false) {
            System.out.println("escolha qual você irá querer:");
            System.out.println("1 - fatorial");
            System.out.println("2 - fibonacci");
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
                    int fiboNumber = scanner.nextInt();
                    System.out.println(fibonacci(fiboNumber));
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

    private int fibonacci(int x) {
        if (x < 0){
            System.out.println("não se pode fazer fibonacci com números negativos!");
            System.out.println("tente novamente");
            return 0;
        }
        if (x < 2){
            return x;
        }
        else{
            return fibonacci( x - 1) + fibonacci(x - 2);
        }
    }
}