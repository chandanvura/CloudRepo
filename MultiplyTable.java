import java.util.Scanner;
public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            // int k = i * 8;
            // System.out.println(k);
            // System.out.println(i * 8);
            System.out.println(n + " * " + i + " =" + i * n);

        }
        sc.close();
    }
    
}
