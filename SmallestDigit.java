import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int smallest = num % 10;
        int temp = num;
        while (temp != 0) {
            int ld = temp % 10;
            if (ld < smallest) {
                smallest = ld;

            }
            temp = temp / 10;
        }
        System.out.println("smallest digit is :" + smallest);
sc.close();

    }
    
}
