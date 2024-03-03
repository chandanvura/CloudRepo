// write a programme to exponentila values of x to the power of y.
import java.util.Scanner;

public class ExpValueXtopowerY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the value of x");
        double x = sc.nextInt();
        System.out.println("entre the value of y ");
        double y = sc.nextInt();
        double exp =1;
        for (int i = 1; i <= y; i++) {

            exp = exp * x;
            
        }
        System.out.println(exp);
        sc.close();


            
        }
    }
    

