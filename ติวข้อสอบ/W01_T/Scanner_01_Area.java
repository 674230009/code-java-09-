package W01_T;
//การหาพื้นที่วงกลมที่มีรัศมีเท่ากับ10
import java.util.Scanner;
public class Scanner_01_Area {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        
        // double redius = 10; //กำหนดชนิดตัวแปร และ ประกาศตัวแปรเก็บค่ารัศมี 
        
        System.out.print("ป้อนค่ารัศมีวงกลม ");
        double redius = kb.nextDouble();

        double area; //กำหนดตัวแปรค่าพื้นที่
        double PI = 3.14159; //กำหนดตัวแปรค่าPI

        area = PI*redius*redius;

        System.out.println("พื้นที่วงกลมที่มีรัศมีเท่ากับ " +redius+ " คือ " + area);
System.out.println("---------------------------------------------------");
    }
}
