//waptp final bill if bill is greater than or equal to 5000 give a discount of 12%
//else
//give a discount of 5%
import java.util.Scanner;

public class BillENew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre number ");

        double bill_amount = sc.nextDouble();
        if(bill_amount>=5000)
        {
            System.out.println("final bill after the discount " + 0.88 * bill_amount);

        }
        else {
            System.out.println("final bill after discount is " + 0.95 * bill_amount);
        }
        sc.close();
    }

    
}
