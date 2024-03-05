import java.util.Scanner;

public class NthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xerox = num;
        int n = sc.nextInt();


        while (num != 0) {
            int count = 0;
            int ld1 = num % 10;
            int temp = xerox;

            while (temp != 0) {
                int ld2 = temp % 10;
                if (ld2 > ld1) {
                    count++;
                }
                temp = temp / 10;
            }

            if (count == (n- 1)) {
                System.out.println(ld1);
                break;
            }
            num /= 10;
        }
        
            
        }
    }
    

