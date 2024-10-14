package W15;

public class Homework_Week15_Link_Github{
    static void fatorial(int n) {
        int result = 1;
        System.out.println("Factorial of" + n + "is");

        // แสดงการคูณแต่ละขั้นตอน
        for (int i = 1; i <= n; i++) {
            result *= i;
            // แสดงการคูณทีละขั้นตอน
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
    static void printfac() {
        System.out.println("Factorial of 5 is");
    }
    static void printF() {
        System.out.println("Factorial of 10 is");
    }



    public static void main(String[] args) {
        fatorial( 5);
        printbar();
        fatorial(10);
    }
}
