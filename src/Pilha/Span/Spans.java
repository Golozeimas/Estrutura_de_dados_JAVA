package Pilha.Span;

import java.util.Arrays;
import java.util.Stack;

public class Spans {

    int[] calcularSpans(int[] precos){
        Stack<Integer> stack = new Stack<>();
        int n = precos.length; // coloquei aqui como inteiro no valor de .length
        int[] spans = new int[n];// criando outro array com valores de precos.length

        for (int i = 0; i < n; i++){
         while(!stack.isEmpty() && precos[stack.peek()] <= precos[i]){
             stack.pop();
         }
         if (stack.isEmpty()){
             spans[i] = i + 1;
         } else{
             spans[i] = i - stack.peek();
         }
         stack.push(i);
        }
        return spans;
    }
}

