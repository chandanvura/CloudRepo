public class SpyCount {
    public static void main(String[] args) {
        int num = 456;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
             
        }

        System.out.println(count); //3

        
        
    }
    
}
