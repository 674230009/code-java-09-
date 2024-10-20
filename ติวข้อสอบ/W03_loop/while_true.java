package W03_loop;
public class while_true {
    public static void main(String[]args){
        int i = 0;
        while(true){
        i++;
        System.out.print(i+ " ");

        if(i>=1000){  //ใช้เมื่อต้องการกำกับว่าให้อยู่ที่1000หรือมากกว่า1000
            break;    //คำสั่งออกจากloop while true
        }
        }

    }
}