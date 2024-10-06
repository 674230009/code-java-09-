//  6) แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
// มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
// มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
// มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
package W14;

public class Homework_Week14_Link  {
    public static void main(String[] args) {
        String [] codes = {"123TH","124EN","125EN","126TH","127EN"};
        
        int count = 0;
// ข้อที่1 แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        int countAll = 0;
        int countEN = 0;
        for(int i=0 ; i< codes.length ; i++){
            if(codes[i].endsWith("TH")){
                System.out.println((i+1) +(". ") + codes[i] + "มาจากประเทศไทย");
                countAll++;
            }else{
                System.out.println((i+1) +(". ") + codes[i] + "มาจากต่างประเทศ");
                countAll++;
                countEN++;
            }
        }

System.out.println("=================================================================================");



// ข้อที่2 มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        System.out.println("จำนวนพัสดุทั้งหมด" + codes.length +"ชิ้น");
        
System.out.println("=================================================================================");
        


// ข้อที่3 มีจำนวนพัสดุที่มาจากประเทศไทยเท่าไหร่
        count = 0;
        for (int i=0 ; i<codes.length ; i++) {
            if (codes[i].endsWith("TH")) {
                count++;
            }
}
System.out.println("มีจำนวนพัสดุมาจากประเทศไทย" + count +"ชิ้น");

System.out.println("=================================================================================");



// ข้อที่4 มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
count = 0;
for (int i=0 ; i<codes.length ; i++) {
    if (codes[i].endsWith("EN")) {
        count++;
    }
}
System.out.println("มีจำนวนพัสดุมาจากต่างประเทศ" + count +"ชิ้น");

 System.out.println("=================================================================================");

    }
}
