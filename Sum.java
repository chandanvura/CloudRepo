import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre length");
        double l = sc.nextDouble();
        System.out.println("entre breadth ");
        double b = sc.nextDouble();
        System.out.println("sum of given numbers is " + (l + b));
        sc.close();
    }

    
}
