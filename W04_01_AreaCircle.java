import java.util.Scanner; //นำเข้าคลาส Scanner จาก package java.util

public class W04_01_AreaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างออบเจ็กด์ของคลาส scanner
        System.out.print("ป้อนค่ารัศมีวงกลม "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radious
        // double radious; // ประกาศตัวเเปรเก็บค่ารัศมี
        // radious = 34; // กำหนดค่ารัศมีเป็น 10
        double area; // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI

        area = PI * radius * radius; // คำนวณพื้นที่ของวงกลม
        System.out.print("พื้นที่ของวงกลมที่มีรัศมีเท่ากัน" + radius + "คือ" + area);
    }
}