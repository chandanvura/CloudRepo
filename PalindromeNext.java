import java.util.Scanner;

public class PalindromeNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //take an infintiy loop to reach next palindrome
        while (true) {
            //go to next number
            num++;

            //to check new number is palondrom or not
            //but careful here, num will become zero so use xerox value;

            int xerox = num;
            //reverse xerox using a loop
            int rev = 0;
            while (xerox != 0) {

                //take last digit
                int id = xerox % 10;

                //store id in rev
                rev = rev * 10 + id;

                //remove last digit 
                xerox = xerox / 10;

            }
            //check rev is equal to num , then print you got next palindrome number 
            //print that number and break infinity loop;
            if (rev == num) {
                System.out.println("Next palindrome number is : " + num);
                break;
            }
        }
        sc.close();

    }
    
}
