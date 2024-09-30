// โจทย์
// 1. สร้างโปรแกรมเพื่อแสดงข้อมูลทั้งหมดใน Array
// 2. หาผลรวมของข้อมูลทั้งหมดใน Array
// 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
// 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
// 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่

package W14;
 import java.util.Scanner; 
public class W14_00_Array_SumNumber {
    public static void main(String[]args) {
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        int numbers[] = { 10, 30, 17, 9, 31, 225, 64, 89, 5, 120 };

        // 1. แสดงรายการข้อมูลใน Array ทั้งหมด
        System.out.println("Data in Array are:");
        for( int i = 0 ; i < numbers.length ; i++ ){  //สามารถใช้ <=9ได้
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n====================================");

        // 2. หาผลรวมของข้อมูลทั้งหมด
        int sum = 0;
        System.out.println("Data in Array are:");
        for( int i = 0 ; i < numbers.length ; i++ ) { 
            System.out.print(numbers[i] + " ");
            sum = sum + numbers[i]; // sun += nunbers[i] การลดรูป
        }
         System.out.println("\nSum of Number = " +sum);

        System.out.println("====================================");

        // 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
        Scanner kb = new Scanner(System.in);
        int[] newNumbers = new int[5];
        for( int i = 0 ; i < newNumbers.length ; i++ ) { 
            System.out.print(numbers[i] + " ");
            System.out.print("Enter number "+ (i+1) + ": ");
            newNumbers[i] = kb.nextInt();
        }
        System.out.println("====================================");

        // 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
        // 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่
        sum = 0;
        System.out.println("Data in Array are:");
        for( int i = 0 ; i < newNumbers.length ; i++ ){  
            System.out.print(newNumbers[i] + " ");
            sum = sum + newNumbers[i]; // sun += newNumbers[i] การลดรูป
        }
        System.out.println("\nSum of Number = " +sum);

        System.out.println("====================================");

        // 6.รวม Array ข้อ1 และ ข้อ3 ให้เป็น Array ใหม่
        int[] mergeNumbers = new int[numbers.length + newNumbers.length];
        for( int i = 0 ; i < numbers.length ; i++ ){
            mergeNumbers[i]=numbers[i];
        }
        for( int i = 0 ; i < newNumbers.length ; i++ ){
            mergeNumbers[numbers.length+i] = newNumbers[i];
        }
        sum=0;
        System.out.println("Data in Array are:");
        for( int i = 0 ; i < mergeNumbers.length ; i++ ){  
            System.out.print(mergeNumbers[i] + " ");
            sum = sum +mergeNumbers[i]; // sun += mergeNumbers[i] การลดรูป
        }
        System.out.println("\nSum of Number = " +sum);

        System.out.println("====================================");
    }

}