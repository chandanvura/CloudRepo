//waptp whether a person is eligible for ias exam or not
//age limit should be of 21-32


import java.util.Scanner;
public class ias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre your age");
        int age = sc.nextInt();

        if (age >= 21 && age <= 32) {
            System.out.println("eligibele for writing ias exam ");
        }
        else {
            System.out.println("not elgible ");
        }
        sc.close();
        
    }
    
}
