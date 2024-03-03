import java.util.Scanner;
public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        //count digits using temp to check possible to split or not 
        int count = 0;
        int temp = num;
        while (temp != 0) 
        {
            count++;
            temp = temp / 10;
            // restore temp

        }
        temp=num;
        if (count % 2 == 0) {

            //we remove count/2 digits from the number 
            int rev = 0;
            for (int i = 1; i <= count / 2; i++) {
                int ld = temp % 10;
                rev = rev * 10 + ld;
                temp /= 10;

            }
            // after removing the left out temp itseflf is first half
            int fh = temp;

            // to get second half, reverse the rev value;

            int sh = 0;
            while (rev != 0) {
                int ld = rev % 10;
                sh = sh * 10 + ld;
                rev /= 10;
            }
            //print first and second half 
            System.out.println("first half is " + fh);
            System.out.println("sceond half is "+sh);

        }
        else {
            System.out.println("cannot split the number ");
        }
        sc.close();
        
    }
    
}
