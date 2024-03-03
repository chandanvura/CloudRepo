import java.util.Scanner;

public class ParkingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre your Catergory ");
        char Grade = sc.next().charAt(0);
        
        if (Grade == 'M'|| Grade == 'm') {
            System.out.println("Parking entry fee is 100");
            
        }
        else if (Grade == 'F' || Grade== 'f'){
            System.out.println("Parking entry fee is 80");
        }

        else if(Grade=='T' || Grade=='t'){
            System.out.println("Parking entry fee is 20");
        }
        
            else if (Grade=='C'||Grade=='c'){
                System.out.println("Parking entry fee is 5");
            }
            else if(Grade =='S' ||Grade=='s'){
                System.out.println("Parking entry fee is free");
            }
            else {
                System.out.println("Invaild type  ");
            }
            sc.close();
    }
    }
    

