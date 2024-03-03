import java.util.Scanner;

public class BouncyIncOrDsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int cd = 10;
        int totalcount = 0;
        int increasingcount = 0;

        while (temp != 0) {

            totalcount++;
            int ld = temp % 10;
            if (ld <= cd) {
                cd = ld;
                increasingcount++;
            }
            temp = temp / 10;

        }
        System.out.println(totalcount);
        System.out.println(increasingcount);

        if (increasingcount == totalcount) {
            System.out.println("Increasing number ");

        }
        else if ((increasingcount - 1) == 0) {
            System.out.println("decreasing number ");
        }
        else {
            System.out.println("Bouncy Number ");
        }
        sc.close();
    }
}