import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enre length of a cubiod ");
        double l = sc.nextDouble();
        System.out.println("entre bredath of the cubiod");
        double b = sc.nextDouble();
        System.out.println("entre height of the cibiod");
        double h = sc.nextDouble();
        double area_volume = l * b * h;
        System.out.println(area_volume);

        sc.close();
        
    }
    
}
