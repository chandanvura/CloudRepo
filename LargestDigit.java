// wap largest digit in the given number
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int LargestNum = num % 10;
        int temp =num;
    

        while (temp != 0) {
            int ld = temp % 10;
            if (ld > LargestNum) {
                LargestNum = ld;
            }

            temp = temp / 10;

        }
        System.out.println("largest number is : " + LargestNum);
        sc.close();
    }
    
}

