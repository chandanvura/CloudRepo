public class NonFibannoicterms {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            
            if (i != sum)
            
            {
                System.out.print(i +" ");
            }
            else {

                sum = a + b;
                a = b;
                b = sum;
            }
        }
        
        
        
    }
}
