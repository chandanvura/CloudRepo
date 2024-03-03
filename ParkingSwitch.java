import java.util.Scanner;
public class ParkingSwitch {
    public static void main(String[] args) {
        System.out.println("Entre Gender ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'M':
            case 'm':
                System.out.println("100");

                break;
            case 'F':
            case 'f':
                System.out.println("80");
                break;

            case 'C':
            case 'c':
                System.out.println("5");
                break;

            case 'T':
            case 't':
                System.out.println("50 ");
                break;

            case 'S':
            case 's':
                System.out.println("20 ");
                break;

            case 'L':
            case 'l':
                System.out.println("Free");
                break;

            default:
                System.out.println("Entre a valid input");
        }
         sc.close();
     }
    
}
