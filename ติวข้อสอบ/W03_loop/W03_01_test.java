package W03_loop;
public class W03_01_test{
    public static void main(String[]args){
        //คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World

        for(int i=1 ; i<= 5 ; i++ ){
            System.out.println("รอบที่ " +i+ " hello World");
        }
System.out.println("==================================================");

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10

        for(int i=1 ; i<=10 ; i++ ){
            System.out.print(i+ " ");
        }
System.out.println("\n==================================================");
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

        int sum = 0; 
        for(int i=1 ; i<=10 ; i++ ){
            System.out.print(i+ " ");
            sum = sum+i;
        }
        System.out.println(" = "+sum); //ถ้าจะหาผลลัพให้เอาไว้นอก for
        System.out.println("==================================================");

//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55

        sum = 0;
        for( int i=1; i<=10 ; i++ ){
            System.out.print(i);
            if(i<10){
                System.out.print("+");
            }
            sum = sum+i;
        }
        System.out.print(" = "+sum);
        //มีการใช้ if เพราะต้องใส่ "+"  เพื่อไม่ให้บวกตามหลัง10-->(10+)
System.out.println("\n==================================================");

        //คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1

    for(int i = 10 ; i>=1 ; i-- ){
        System.out.print(i+" ");
    }
System.out.println("\n==================================================");

    //คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่

        for( int i = 1; i<=5 ; i++){
            
            if( i%2 == 0){
                System.out.println("รอบที่" + i +"เลขคู่");

            }else{
                System.out.println("รอบที่" + i +"เลขคี่");
            }
        }

    }
}