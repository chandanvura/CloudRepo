/*th grade and admission in 11
a/a - 70,000
B/b-90,00
C/c -1,00,000
D/d --1,50,000
E/f -- 2,00,000
F/f -- no admission 
*/
import java.util.Scanner;

public class GradeAdmission {
    public static void main(String[] args) {
        System.out.println("entre the grade ");
        Scanner sc = new Scanner(System.in);
        char Grade = sc.next().charAt(0);
        if (Grade == 'A'|| Grade == 'a') {
            System.out.println("Your fees is 70,000");
            
        }
        else if (Grade == 'B' || Grade== 'b'){
            System.out.println("Your fees is 90,000");
        }

        else if(Grade=='C' || Grade=='c'){
            System.out.println("Your fees is 1,00,000");
        }
        
            else if (Grade=='D'||Grade=='d'){
                System.out.println("Your fees is 1,50,000");
            }
            else if(Grade =='E' ||Grade=='e'){
                System.out.println("Your fess is 2,00,000");
            }
            else {
                System.out.println("You have no admission ");
            }
            sc.close();
    }

    
}
