package W13;
public class W13_01_intoArray {
    public static void main(String[] args) {

        //การประกาศตัวแปรแบบรู้ค่า Array แบบที่1 - รู้จำนวนข้อมูลล่วงหน้า
        String[] colers = {"Purple","Cryn","Blue","Green","Yellow","Orange","Red"};
        int[] banks = {20,50,100,500,1000};
        char[] alphabet = {'A' , 'B' , 'C' , 'D' , 'E'};

        //แสดงผลลัพธ์โดยใช้ index ของ Array 
        System.out.println("The firat coler is " + colers[0]);
        System.out.println("The Third alphabet " + alphabet[2]);
    
        //แสดงผลโดยใช้ Loop
        System.out.println("Colers in the array are:");
        for(int i=0 ; i < 7 ; i++) {
            System.out.print(colers[i] + " ");
        }
        System.out.println();

        System.out.println("====================================================================");

        for(int i = 6 ; i >= 0 ; i--) {
            System.out.print(colers[i] + " ");
            }
        System.out.println();
        System.out.println("====================================================================");
    
        System.out.println("Banks in the array are:");
        for (int i=0 ; i < banks.length ; i++) {
            System.out.print(banks[i] + " ");
            
        }
    }
}