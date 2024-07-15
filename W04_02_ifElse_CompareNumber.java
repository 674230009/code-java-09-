import java.util.Scanner;

public class W04_02_ifElse_CompareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Secondt number: ");
        int num2 = input.nextInt();

        int resulf = 0;

        if (num1 > num2) {
            resulf = num1 - num2;
            System.out.print("the number 1 is greater than the number 2");
        } else {
            resulf = num1 + num2;
            System.out.print("the number 1 is less than or equal to the number 2");
        }
        System.out.println("the result is:" + resulf);
    }

}