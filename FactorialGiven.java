import java.util.Scanner;;

public class FactorialGiven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();
        int prod =1;
        for (int i = 1; i <= fac; i++) {
            
            prod = prod *i ;

        }
        System.out.println(prod);
        sc.close();
    }
    
}
