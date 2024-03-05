import java.util.Scanner;

public class unique {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    

        boolean isUni = true;


        while (num != 0) {
            int ld1 = num % 10;
            num = num / 10;
            int temp = num;

            while (temp != 0) {
                int ld2 = temp % 10;
            

                if (ld1 == ld2) {
                    isUni = false;
                    break;

                }
                temp = temp / 10;
            }
        }
        if (isUni) {
            System.out.println("unique number ");
        }
        else {
                System.out.println("not a unique number ");
            }


    }
}

