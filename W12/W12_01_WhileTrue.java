package W12;

public class W12_01_WhileTrue {
    public static void main(String[] args) {

        int i = 0;                               // กำหนดค่าเริ่มต้น
        while(true){                             // วนลูปไปเรื่อยๆ  ใช้ while (true) {
            i++;                                 // เพิ่มค่า 1 ทีละ 1
            System.out.print(i+" ");             // แสดงค่า i
            
            if(i >= 1000){
                break;                           // ออกจากลูป
            }
            
            if(i >= 1000)  break;
                                                 
        }
    }
}