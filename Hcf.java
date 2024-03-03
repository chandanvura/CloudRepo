//wap to find lcm of two numbers
public class Hcf {
    public static void main(String[] args) {
        int n1 = 120;
        int n2 = 135;
        int hcf=0;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("Hcf of "+ n1+"and"+n2+"is: "+ hcf);
    }
    
}
