import java.util.Scanner;
public class SwitchREsult {
    public static void main(String[] args) {
        System.out.println("Entre Grade ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("You got first rank");

                break;
            case 'B':
            case 'b':
                System.out.println("You got second rank");
                break;

            case 'C':
            case 'c':
                System.out.println("You got first class");
                break;

            case 'D':
            case 'd':
                System.out.println("You got  second class ");
                break;

            case 'E':
            case 'e':
                System.out.println("You just passed in exam ");
                break;

            case 'F':
            case 'f':
                System.out.println("you are failed");
                break;

            default:
                System.out.println("Entre a valid input");
        }
         sc.close();
     }
    
}
