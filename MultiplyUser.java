import java.util.Scanner;

public class MultiplyUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number");
        int k = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            //int m = k * i;

            System.out.println(k + "*" + i + "=" + i * k);

        }
        sc.close();
    }
    
}
