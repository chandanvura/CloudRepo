public class splitnum2 {
    public static void main(String[] args) {
        int num = 654321;

        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp = temp / 10;
       // find divsior by multiply 10, count/2 times 
        }
        int divisor = 1;
        for (int i = 1; i <= count / 2; i++) {
            divisor *= 10;
        }

        //divide num by divisor
        //get first half by conserding quotient
        //get second half by conserdig the reminder 

        int fh = num / divisor;
        int sh = num % divisor;
        System.out.println(sh);
        System.out.println(fh);
    }
    
}
