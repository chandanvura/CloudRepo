import java.util.Scanner;
public class IFELSE {
    public static void main(String[] args) {
      /*   int a = 123;
      if (a < 10) {
        System.out.println(a + " is single digit");
      }
      else {
        System.out.println(a + " it is not a single digit ");
      }*/
      Scanner sc = new Scanner(System.in);
      System.out.println("entre the age");
      int age = sc.nextInt();
      if (age >= 18) {
          System.out.println("you are eligible");

      }
      else {
        System.out.println("you are not eligible ");
      }
      sc.close();
      
    }
    
}
