import java.util.Scanner;

public class UserLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre your name ");
        String name = sc.next();
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " " + name);

        }
        sc.close();

    }
    
}
