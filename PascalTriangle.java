public class PascalTriangle {
    public static void main(String[] args) {
        int space = 5;
        int pair = 1;
        for (int i = 1; i <= 6; i++) {
            int x = 1;
            int nm = i - 1;
            int dn = 1;
            for (int j = 1; j <= space; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= pair; k++) {
                System.out.print(x + " "); 
                x = (x * nm) / dn;
                nm--;
                dn++;
            }
            space--;
            pair++;
            System.out.println(); 
        }
    }
}






/*
 * import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int rows = scanner.nextInt();

        // Print Pascal's triangle
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

 */