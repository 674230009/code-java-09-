//เรื่องเลขคู่เลขคี่
package W02_IfElse;
import java.util.Scanner;
public class W02_01_oddEven{
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        int result = number % 2;

        if( result == 0 ){
            System.out.print(number + " is an even number. ");

        }else{
            System.out.print(number + " is an odd number. ");

        }  
    }
}