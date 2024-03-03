public class HappynumDowhile {
    public static void main(String[] args) {
        
        int num = 49;


        do{
            int sum =0;
            while(num!=0){
                int ld = num %10;
                sum = sum +ld*ld;
                num = num /10;
            }

            num = sum ;
        }
        while (num > 9);
        {
            if(num == 1){
                System.out.println("hapy number ");
            }
            else{
                System.out.println("Not a happy number ");
            }
        }

    }
    
}
