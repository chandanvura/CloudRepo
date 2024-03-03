//write a programme to reverse a number ;
import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        int xerox = a;
        while (xerox != 0) {
            int ld = xerox % 10;                //last digit taking from num 
            rev = rev * 10 + ld;                //revere the number and stroing another varibale
            xerox = xerox / 10;                 //remove last digit from num                
           
        }
        System.out.println("reverse  number : " + rev);
        sc.close();
    }
    
}
