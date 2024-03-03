public class Checknum {
    public static void main(String[] args) {
        int sln = 1;
        for (int num = 1; num <= 10000; num++) {
            //int xerox = num;
            int sum = 0;
            int prod = 1;
            while (num != 0) {
                int id = num % 10;
                sum = sum + id;
                prod = prod * id;
                num = num / 10;
            }

            if (sum == prod) {
                System.out.println(sln +"--"+ num);
                sln++;
            }
        }
    }
    
}
