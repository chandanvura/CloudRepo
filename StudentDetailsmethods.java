public class StudentDetailsmethods {

    public static void deatils(String name, double percentage, int ld) {
        System.out.println("name of the stident " + name);
        System.out.println("12th percentage of the student " + percentage);
        System.out.println("student id is "+ ld);
    }

    public static void main(String[] args) {
        deatils("chandan", 99.99, 196);
        System.out.println("-------------------");
        deatils("jobless", 95.2, 197);
        System.out.println("---------------");
        deatils("number one ", 90.09, 19);

        
    }
    
}
