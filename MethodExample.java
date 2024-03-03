public class MethodExample {

    public static void run() {
        System.out.println("Run daily is good for health ");
    }

    public static void sing() {
        System.out.println("singing need lots of practice");
    }

    public static void main(String[] args) {
        System.out.println("Main methods stars ");
        //method calling 
        run();
        sing();
        System.out.println("Main methods ends ");
    }

}
//important points 
/*
there can be any number of a methods in a class but jvm will executes only main method 
 * -- jvm will executes only main method
 * -- in order execuetes user defiend methods we have to perform method calling process 
 * -- method calling syntax 
 * 
 * -- method name ();
 * -- jvm will execute only those methods which are called from main method  
 * --  we can call a method in any number of times       
 * 
 */

/*
 * method without arguments without return type
 * method with arguments without retrun type
 * method with arguments with retrun type
 */