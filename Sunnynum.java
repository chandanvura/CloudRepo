import java.util.Scanner;

public class Sunnynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean isSunny = false;
        for (int i = 1; i*i<=n+1; i++) {
            if (i * i == (n + 1)) {
                isSunny = true;
                break;
            }
        }
        if (isSunny) {
            System.out.println("sunny number ");
        }
        else {
            System.out.println("not a sunny number ");
        }
        sc.close();
        
    }
}



/*
 * 
 * int num = sc.nextInt();
        int nextNum = num + 1;
        int i = 0;

        while (i * i <= nextNum) {
            if (i * i == nextNum) {
                System.out.println(num + " is a sunny number.");
                return;
            }
            i++;
        }

        System.out.println(num + " is not a sunny number.");
 */