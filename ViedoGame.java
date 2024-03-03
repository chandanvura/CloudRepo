import java.util.Scanner;

public class ViedoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("its a weekedn or not ? ,if yesy entre true and else");
        boolean isWeekend = sc.nextBoolean();
        System.out.println("entre number of hours you played ");
        double time = sc.nextDouble();
        if (isWeekend == true) {

            if (time <= 3) {
                System.out.println("mom will not scold you ");
            } else {
                System.out.println("mom will scold you ");
            }

        }
        else {
            if (time <= 2) {
                System.out.println("mom will not scold you ");
            } else {
                System.out.println("mom will scold you ");
            }

        }
        sc.close();
    }
    
}
