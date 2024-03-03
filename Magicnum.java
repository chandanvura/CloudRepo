public class Magicnum {
    public static void main(String[] args) {
        int num = 325;
        int sum = 0;

        while (num > 9) {

            //restore the value 
            sum = 0;
            while (num != 0) {
                int ld = num % 10;
                sum = sum + ld;
                num = num / 10;
            }
            num = sum;
        }

        if (sum == 1) {
            System.out.println("Magic number ");
        }
        else {
            System.out.println("Not a magic number ");
        }
        
    }
    
}
