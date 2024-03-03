
//xyleom number means sum of extreme digits is equal to sum of  mean(reaming) digits;
//if they are not equal phloem number 
import java.util.Scanner;

public class XyleomOrPholem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number ");
        int num = sc.nextInt();
        //use temp to find first digit 
        int temp = num;
        while (temp > 9) {
            temp = temp / 10;
        }
        //find sum of first and last digit 
        int firstDigit = temp;
        int sum1 = firstDigit + num % 10;

        //find sum of alll the digits including first and last 
        temp = num;

        int sum2 = 0;
        while (temp != 0) {
            int ld = temp % 10;
            sum2 = sum2 + ld;
            temp = temp / 10;
        }
        //to get sum of mean digits (excluding firsr and last) subract sum of first and last digit in total sum 

        int sumOfmean = sum2 - sum1;

        System.out.println(sumOfmean);

        if (sumOfmean == sum1) {
            System.out.println("it is a xyleom number ");
        } else {
            System.out.println("it is pholem number ");
        }

        /*  int lastdigit = num % 10;
        
        int temp = num;
        while (temp > 9 && temp!=0) {
            temp = temp / 10;
        
            int sum = lastdigit + temp;
        
        }
        System.out.println(sum);*/

        sc.close();

    }

}

/*
 * int num =74568;
 * int temp = num;
 * int sum1=0;
 * int sum2=0;
 * while(temp!=0 ){
 * int ld = temp%10;
 * if(temp <10 || temp==num) // if it is first digit or last digit add in the sum 
 * {     
 * sum1= sum1+ld;
 * else{
 * sum 2= sum2+ld;
 * }
 * }
 * temp =temp/10;
 * 
 * }
 * if(sum1==sum2){
 * sout("xyleom number ")
 * }
 * else{
 * sout("phloem number ")
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */