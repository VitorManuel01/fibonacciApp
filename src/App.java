



public class App {
    public static void main(String[] args) throws Exception {
        
        Fibonacci fibonacci = new Fibonacci();

        

        if(fibonacci.gerarFibonacci(10).contains(7)){
            System.out.println("O número 7 existe");
        }else{
            System.out.println("\nO número 7 não existe");
        }
    }
}
