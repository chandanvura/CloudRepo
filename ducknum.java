import java.util.Scanner;

public class ducknum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xerox = num;
        boolean isDuck = false;

        // Check if the number contains zero digit but doesn't start with zero
        while (xerox != 0) {
            int ld = xerox % 10;
            xerox = xerox / 10;
            if (ld == 0 && xerox != 0) { // Check if zero digit occurs after the first digit
                isDuck = true;
                break;
            }
        }

        if (isDuck) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }
        sc.close();

    }
}

/*
 * int num =1023;
 * boolean isDuck =false;
 * int xerox = num;
 * while(xerox !=0){
 * int ld = xerox%10;
 * if(ld==0)
 * isDuck =true;
 * break;
 * xerox=xerox/10;
 * }
 * if(isDuck==true){
 * sout("Duck NUmber");
 * }
 * else{
 * sout("Not a duck Number ");
 * }
 */

//Alternative
/*
 * int num =2304;
 * int xerox = num;
 * int x =0;  replace //int count
 * while(xerox!=0){
 * int ld = xerox%10;
 * if(id==0){
 * x =1;  //inplace we can write count++;
 * break;
 * }
 * xerox = xerox/10;
 * }
 * if(x==1)   replace //count>0{
 * sout("duck")
 * }
 * else{
 * sout("not duck")
 * }
 */
