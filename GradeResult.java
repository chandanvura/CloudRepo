import java.util.Scanner;

public class GradeResult {
    public static void main(String[] args) {
        System.out.println("entre a grade ");
        Scanner sc = new Scanner(System.in);
        char Grade = sc.next().charAt(0);

        if (Grade == 'A'|| Grade == 'a') {
            System.out.println("first rank");
            
        }
        else if (Grade == 'B' || Grade== 'b'){
            System.out.println("second rank");
        }

        else if(Grade=='C' || Grade=='c'){
            System.out.println("first class");
        }
        
            else if (Grade=='D'||Grade=='d'){
                System.out.println("second class");
            }
            else if(Grade =='E' ||Grade=='e'){
                System.out.println("just pass");
            }
            else if (Grade == 'F' || Grade == 'f') {
                System.out.println("fail");
            }
            else
            {
                System.out.println("entre a valid input ");
            }
    sc.close();

    }
    
}
