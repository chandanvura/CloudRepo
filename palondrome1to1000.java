import java.util.Scanner;
public class palondrome1to1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sln = 1;
        for (int num = 1; num <= x; num++) {

            //dont use num variable for reversing
            //since num will become zero , loop will never end 
            //use xerox variable for revsers

            int xerox = num;
            int rev = 0;
            while (xerox != 0) {
                //take last digit
                int ld = xerox % 10;
                //store id in reverse 
                rev = rev * 10 + ld;
                //remove ld from xerox 
                xerox = xerox / 10;
            }
            // check rev is equal to num or not , that is palindrome or not 
            if (num == rev) {
                System.out.println(sln + ")" + num);
                sln++;

            }
        }
        sc.close();
    }
    
}
