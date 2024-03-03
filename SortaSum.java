import java.util.Scanner;

public class SortaSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number1");
        int n1 = sc.nextInt();
        System.out.println("entre number 2 ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;

        if ((sum <= 10) || (sum >= 20)) 
         {
            System.out.println("True" + sum);
        }
        else {
            System.out.println("20");
        }
        
sc.close();
        
    }
    
}
