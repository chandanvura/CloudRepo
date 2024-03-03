import java.util.Scanner;

public class Squirrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int play = sc.nextInt();
        System.out.println("Enter whether it is summer or not ");
        boolean isSummer = sc.nextBoolean();

        if ((isSummer == true && play >= 60 && play <= 100) || (isSummer == false && play > 60 && play < 90)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
