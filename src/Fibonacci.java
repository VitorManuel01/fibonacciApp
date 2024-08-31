import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Integer> gerarFibonacci(int n){
        int a = 0, b = 1, c;
        System.out.print(a + " " + b); 
        List<Integer> sequenciaFibonacci = new ArrayList<>();

        sequenciaFibonacci.add(a);
        if (n > 1) {
            sequenciaFibonacci.add(b);
        }

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            sequenciaFibonacci.add(c);
            a = b;
            b = c;
        
        }
        return sequenciaFibonacci;
    }
}