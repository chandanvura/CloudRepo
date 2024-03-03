//prime factors of a given number 
//with arguments and with return type 
public class CountOfFactorsMethos {

    public static int factors(int x) {

        // replace the void main datatype of the returning values 
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = factors(6);

        if (count == 2) {
            System.out.println("Prime number ");
        }
        System.out.println("not a prime ");


      //  System.out.println("count of factors of 6 is "+factors(6));
        
        
    }
    
}
