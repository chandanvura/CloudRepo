import java.util.Scanner;

public class SimpeIntrest {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("entre principle intrest  ");
    double p = sc.nextDouble();
    System.out.println("Entre time ");
    double t = sc.nextDouble();
    System.out.println("entre amount ");
    double r = sc.nextDouble();
    double intrest = (p * r * t) / 100;
    System.out.println(intrest);

    sc.close();
    
}
}
