package W13;

public class W13_03_Array_CountOddEven{
    public static void main(String[] args){

    //ให้นับจำนวนเลขคู่และเลขคี่ใน Array ด้านล่าง
   int [] numbers = {1,5,2,22,14,68,77,54,35,95,35};

    int countOdd = 0;
    int countEven = 0;

    for( int i = 0 ;i < numbers.length ;i++ ) {
        System.out.print(numbers[i] + " ");
        if(numbers[i] % 2 == 0){
            countEven++;
        }else{
            countOdd++;
        }
    }
    System.out.println("Amout of all Number" + numbers.length);
    System.out.println("Amout of Odd Number" + countOdd);
    System.out.println("Amout of Even Number" + countEven);

} 
}
