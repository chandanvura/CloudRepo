//lcf of two numbers 
public class Lcm {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 15;
        int i = 1;
        while (true) {
            if ((n1 * i) % n2 == 0) {
                System.out.println("lcm is :" + (n1 * i));
                break;
            }
            i++;
        }
    }
    
}
