import java.util.Scanner;

public class DateFashion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre rating");
        int you = sc.nextInt();
        System.out.println("entre date rating");
        int date = sc.nextInt();
        
        if ((you >= 8 && date >= 3)||(you >=3 && date >= 8) ) {
            System.out.println("2");
        }
            
        else if (you <=2 || date <= 2) {
            
            System.out.println("0");

        }
        else
        {
            System.out.println("1");
        }

        sc.close();

        
    }
    
}
