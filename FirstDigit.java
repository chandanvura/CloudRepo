import java.util.Scanner;

//print first Digit  in the given number;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 9) {
            num = num / 10;
        }
        System.out.println(num);
        sc.close();
    }

    
    
}
