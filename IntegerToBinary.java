import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enytre a number ");

        int num = sc.nextInt();

        String s = "";

        while (num != 0) {
            int rem = num % 2;
            s = rem + s;
            num = num / 2;
        }
        System.out.println(s);
        sc.close();
    }
    
}
