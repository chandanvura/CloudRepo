public class Nonfibonnaci{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        
        // Print the first two Fibonacci numbers
        System.out.print(a + " " + b + " ");
        
        int sum = 0;
        
        // Generate and print Fibonacci numbers until the next number exceeds 1000
        while (sum <= 1000) {
            sum = a + b;
            if (sum <= 1000) {
                System.out.print(sum + " ");
            }
            a = b;
            b = sum;
        }
    }
}


/*
 * int a =0;
 * int b =1;
 * int sum =0;
 * while(sum<=1000){
 * 
 * sout(sum)
 * a=b;
 * b=sum;
 * sum = a+b;
 * 
 * }
 */