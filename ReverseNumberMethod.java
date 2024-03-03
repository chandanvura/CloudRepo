public class ReverseNumberMethod {


    public static void ReverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("everse the number "+ rev);

    }

    public static void main(String[] args) {
        int n1 = 843;
        int n2 = 3456;
        int n3 = 65434;

        ReverseNumber(n1);
        ReverseNumber(n2);
        ReverseNumber(n3);
        

    }
    
}
