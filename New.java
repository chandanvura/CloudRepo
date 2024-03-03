import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre radius of the circle ");
        double r = sc.nextDouble();
        double  area = 3.14 *r *r;
        System.out.println(area + " Centimeters");
        sc.close();
       
    }
    
}
