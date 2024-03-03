import java.util.Scanner;
public class SWitchcase {
    public static void main(String[] args) {
        System.out.println("entre a number ");
        Scanner sc = new Scanner(System.in);
         int a= sc.nextInt();

         switch (a) {
             case 1:
                 System.out.println("Hello");

                 break;
             case 2:
                 System.out.println("hi");
                 break;

             case 3:
                 System.out.println("Number");
                 break;

             case 4:
                 System.out.println("coffee");
                 break;

             case 5:
                 System.out.println("block ");
                 break;

             default:
                 System.out.println("Entre a valid input");
         }
         sc.close();
     }
    
}
