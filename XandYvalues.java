import java.util.Scanner;

public class XandYvalues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entre x value ");
        int x = sc.nextInt();
        System.out.println("Entre y value ");
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
        sc.close();

    }
}
