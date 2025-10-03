package Recursão.fatorial;

public class fatorial {

    int fatorial(int x){
        if(x == 1){
            return 1;
        }
        else{
            return x * fatorial(x - 1);
        }
    }

}
