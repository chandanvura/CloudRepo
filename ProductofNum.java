public class ProductofNum {
    public static void main(String[] args) {
        int number  = 345;
        int product = 1;
        while (number != 0) {
            
            int last_digit = number % 10;
            product  = product  * last_digit;
            number = number / 10;

        }
        System.out.println(product);
    }
    
}


//get last digit num%10;
// remove last number num /10;
