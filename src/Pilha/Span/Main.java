package Pilha.Span;

public class Main {
    public static void main(String[] args) {
    Spans span = new Spans();
    int[] precos = {0,20,30,20,10,50,70}; // array diretamente sem precisar de várias linha
    int[] b = span.calcularSpans(precos);
        for (int spans : b){
            System.out.print( " span: " + spans);
        }
        System.out.println();
        for (int numeros : precos){
            System.out.print(" número: " + numeros);
        }
    }
}
