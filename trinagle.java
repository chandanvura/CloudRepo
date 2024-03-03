import java.util.Scanner;

public class trinagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre base of a triangle");
        double l = sc.nextDouble();
        System.out.println("Entre height of the trinagke ");
        double h = sc.nextDouble();
        double aera = 0.5 * l * h;
        System.out.println(aera);
        sc.close();
 }

    
}
