import java.util.Scanner;

public class PascalTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int rows = scanner.nextInt();

        int[][] triangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1; // First and last elements of each row are always 1
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print("  " + triangle[i][j] + " ");
            }
            System.out.println();
        }
scanner.close();
    }
}
