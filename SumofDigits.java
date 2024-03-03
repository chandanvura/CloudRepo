public class SumofDigits {
    public static void main(String[] args) {
        int number  = 345;
        int sum = 0; //5
        while (number != 0) {
            
            int last_digit = number % 10;  //
            sum = sum + last_digit;
            number = number / 10;

        }
        System.out.println(sum);
    }
    
}


//get last digit num%10;
// remove last number num /10;
