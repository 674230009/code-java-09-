//เรื่อง จำนวนเต็ม บวก ลบ ศูนย์
package W02_IfElse;
import java.util.Scanner;
public class W02_02_PosNegZero {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt(); //ใช้เป็น double จะดีกว่า

        if(number > 0 ){
            System.out.println(number + " is a positive number. ");
        }else if(number < 0) {
            System.out.println(number + " is a Negative number. ");
        }else{
            System.out.println(number + " is a Zero number. ");
        }

        // if(number > 0 ){
        //     System.out.println(number + " is a positive number. ");
        // }else if(number < 0) {
        //     System.out.println(number + " is a Negative number. ");
        // }else if(number == 0){
        //     System.out.println(number + " is a Zero number. ");
        // }else{
        //     System.out.println(" nvalid input. "); จะเเสดงเมื่อในตัวอื่นที่ไม่ใช่ตัวเลข
        // }

    }
    
}
