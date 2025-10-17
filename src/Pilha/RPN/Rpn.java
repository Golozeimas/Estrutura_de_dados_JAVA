package Pilha.RPN;
import java.util.Stack;

public class Rpn {
    public double avaliarRPN(String expressao) {
        double x, y, z, o = 0;
        Stack<Double> caracteres2 = new Stack<>();
        String[] caracteres = expressao.split(" ");
        for (String a : caracteres) {
            try{
               double numero = Double.parseDouble(a);
               caracteres2.push(numero);
            }catch (NumberFormatException e) {
                switch (a) {
                    case "-":
                        x = caracteres2.pop();
                        y = caracteres2.pop();
                        z = y-x;
                        o = caracteres2.push(z);
                        break;
                    case "/":
                        x = caracteres2.pop();
                        y = caracteres2.pop();
                        z = y/x;
                        o = caracteres2.push(z);
                        break;
                    case "+":
                        x = caracteres2.pop();
                        y = caracteres2.pop();
                        z = y+x;
                        o = caracteres2.push(z);
                        break;
                    case "*":
                        x = caracteres2.pop();
                        y = caracteres2.pop();
                        z = y*x;
                        o = caracteres2.push(z);
                        break;
                }

            }
        }
        return o;
    }
}