public class SpyNumberFrom1To10000 {
    public static void main(String[] args) {
        int sln = 1;
        for (int num = 1; num <= 10000; num++) {
            int xerox = num;
            int sum = 0;
            int prod = 1;
            while (xerox != 0) {
                int id = xerox % 10;
                sum = sum + id;
                prod = prod * id;
                xerox = xerox / 10;
            }

            if (sum == prod) {
                System.out.println(sln + "--" + num);
                sln++;
            }
        }
    }
    
    
}
