package W15;

public class Homework_Week15_Link_Github{
    static void fatorial(int n) {
        int result = 1;
        System.out.println("Factorial of" + n + "is");

      
        for (int i = 1; i <= n; i++) {
            result *= i;
           
            if (i>= n) {
                System.out.print(i + " = " + result);
            
            } else {
                System.out.print(i + " x ");
            }
        }
    }
    static void printbar() {
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        fatorial( 5);
        printbar();
        fatorial(10);
    }
}
