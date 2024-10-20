package W01_T;
import java.util.Scanner;
public class Scanner_If_else_01 {
    public static void main (String[]arhs){
        Scanner kb = new Scanner(System.in); //การสร้าง objeck

        System.out.print("Enter the first number: ");
        int num1 = kb.nextInt();//รับข้อมูลตัวเลขตัวแรก
        System.out.print("Enter the second number: ");
        int num2 = kb.nextInt();//รับข้อมูลตัวเลขตัวที่สอง

        int result = 0; //สร้างไว้เพื่อไม่ให้ result ไม่เออเร่อ

        if(num1>num2){   //ภายใน()ของ if คือ ให้ใส่เงื่อนไข
            result = num1-num2;
        }else{
            result = num1+num2;
        }
        System.out.println("the result is : " + result ); //แสดงผลลัพธ์เมื่อผ่านการคัดแยกจากif-elseแล้ว

System.out.println("-------------------------------------------------------------------------");


//ให้แสดงผลเป็น 
//Run ครั้งแรก
//Enter the first number: 10
//Enter the second number: 8
//The number 1 is greater than the number 2
//the result is : 2

//Run ครั้งที่2
//Enter the first number:  2
//Enter the second number: 9
//The number 1 is less than or equal to the number 2
//the result is : 11

    System.out.print("Enter the first number: ");
    num1 = kb.nextInt();//รับข้อมูลตัวเลขตัวแรก
    System.out.print("Enter the second number: ");
    num2 = kb.nextInt();//รับข้อมูลตัวเลขตัวที่สอง

        if(num1 > num2){
            System.out.println("The number 1 is greater than the number 2");
            result = num1-num2;
        }else{
           System.out.println("The number 1 is less than or equal to the number 2");
           result = num1+num2;
        }
        System.out.println("the result is : " + result);
System.out.println("-------------------------------------------------------------------------");

    }
}
