import java.util.Scanner;

public class ElseifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the number ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("its a postive ");
        }
        else if (a < 0) {
            System.out.println("its negative ");

        }
        else
        {
            System.out.println("its neutral");
        }
        sc.close();
    }

    
}
