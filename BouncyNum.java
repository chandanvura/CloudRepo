// writre a programme to print bouncy number 
// condtion menas if the number is increasing  then it is a bouncy number;
// eg: 123456 --increaing --bouncy number
//125422 -- not incresing -- not a bouncy number 
// 122334455 -- incrsing -- bouncy number 
import java.util.Scanner;
public class BouncyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //taking a compare digit 
        int compareDigit = 10;
        boolean isIncreasing = true;
        int temp = num;

        //read and remove the last digit 
        while (temp != 0) {

            int ld = temp % 10;
            //after reading the digit compare the digit with comapring number 
            if (ld <= compareDigit) {
                // assinging comapre number as last digit 
                compareDigit = ld;
                // if not break
            } else {
                isIncreasing = false;
                break;
            }
            // removing the last number from the given digit 

            temp = temp / 10;
        }
        
        if (isIncreasing) {
            System.out.println("Increasing number ");
        }
        else {
            System.out.println("Not increaing number ");
        }
        sc.close();
        
    }
    
}
