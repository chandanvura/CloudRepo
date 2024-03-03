public class pattern9 {
    public static void main(String[] args) {
        char x ='A'; //or we can use ascii value as 65
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" "+x+" ");
                x++;
            }
            System.out.println();
        }
    }
    
}
