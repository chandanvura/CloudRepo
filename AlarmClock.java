import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day code ");
        int day = sc.nextInt();
        System.out.println("Ask vacation or not (true or false)");
        boolean vac = sc.nextBoolean();

        if (vac == true && day >= 0 && day <= 6)  {
            System.out.println("Alarm is at 10:00 clock ");
        } else if (vac == true && day == 7) {
            System.out.println("No alarm ");
        } else if (vac == false && day >= 0 && day <= 6) {
            System.out.println("Alarm is at 7:00 clock ");
        } else {
            System.out.println("Alarm is at 10:00 clock ");
        }

        sc.close();
    }
}

/*
if(vacation == true) {
    if(daycode >= 1 && daycode <= 5) {
        System.out.println("10:00");
    } else {
        System.out.println("off");
    }
} else {
    if(daycode >= 1 && daycode <= 5) {
        System.out.println("7:00");
    } else {
        System.out.println("10:00");
    }
}

 */