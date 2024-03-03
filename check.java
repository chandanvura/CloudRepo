import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre number of cigars ");
        int cigars = sc.nextInt();
        System.out.println("if it is weekend entre true or else entre false");
        boolean isWeekend = sc.nextBoolean();

        /* if((weekend == true && cigars >= 40) || (if(weekeden == false &&cigars >= 40 && cigars <= 60 )) 
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("fasle");
        }
        */
        
        if (isWeekend == true) {
            if (cigars >= 40) {
                System.out.println("true ");
            } else {
                System.out.println("false");
            }

        }
        else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
        
    }
    
}
