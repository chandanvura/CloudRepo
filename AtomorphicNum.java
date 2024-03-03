import java.util.Scanner;
public class AtomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = num * num;
        boolean isautomorphic = true;

        while (num != 0) {
            if ((num % 10) != (sum % 10)) {
                isautomorphic = false;
                break;
            }

            num /= 10;
            sum /= 10;
        }
        if (isautomorphic) {
            System.out.println("its a automorphic number");
        }
        else {
            System.out.println("not a automorphic");
        }

        sc.close();
    }
    
}
