public class prime1to100 {
    public static void main(String[] args) {
        int sln = 1;
        for (int x = 1; x <= 100; x++) {
            
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(sln + "." + x);
                sln++;
            }
        }
    }
}


/*
 * int n=1;
 * 
 */