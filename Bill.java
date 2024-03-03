import java.util.Scanner;

public class Bill {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        System.out.println("WELCOME TO ZUDIO");
        System.out.println("ZUDIO KPHB");
        System.out.println("===================");
        System.out.println("entre marked / taged price");
        double mrp = sc.nextDouble();
        // System.out.println("GST");
         //double tax = sc.nextDouble();
         double tax = (mrp * 18) / 100;
         double total = mrp + tax;
         System.out.println("Bill is " + total);
         System.out.println("entre discount percentage ");
         double dsc = sc.nextDouble();
         double Final_Disc = total - (dsc / 100)*total ;
         
        // double Final_Disc = total - (20.0 / 100)*total ;
        System.out.println("FinaL bill is " + Final_Disc);
        sc.close();


    }
}