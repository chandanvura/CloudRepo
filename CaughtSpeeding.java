import java.util.Scanner;

public class CaughtSpeeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the speed");
        int speed = sc.nextInt();
        System.out.println("birtday or not ");
        boolean bday = sc.nextBoolean();

         if ((speed <= 65 && bday == true) || ((speed <= 60 && bday == false))) {
            System.out.println("0");
        } else if ((speed > 60 && speed <= 80 && bday == false) || ((speed > 65 && speed <= 85 && bday == true))) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        
        
        /*if(bday == true ){
            if(speed = 0 && speed <=65){
                sout("no ticket :0");
        
            }
            elseif(speed>=66&&speed<=85){
                sout("small ticket :1");
        
            }
            else{
                sout("big ticket :2")
            }
        } 
        */
sc.close();
    }
    
}
