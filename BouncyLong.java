import java.util.Scanner;

public class BouncyLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cd = 10;
        boolean isIncreasing = true;
        int temp = num;
        while (temp != 0) {
            int ld = temp % 10;
            if (ld <= cd) {
                cd = ld;
            } else {
                isIncreasing = false;
                break;
            }
            temp = temp / 10;
        }
        cd = 0;
        boolean isDecreasing = true;
        temp = num;
        while (temp != 0) {
            int ld = temp % 10;
            if (ld >= cd) {
                cd = ld;
            } else {
                isDecreasing = false;
                break;

            }
            temp = temp / 10;

        }
        if (isIncreasing) {
            System.out.println("Increasing num");
        }
        else if (isDecreasing) {
            System.out.println("Decreasing nuber");
        }
        else {
            System.out.println("Bouncy number ");
        }
        sc.close();
    }
    
}
