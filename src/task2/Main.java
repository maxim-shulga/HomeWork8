package task2;

import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Worker [] workers = new Worker[5];

        int minService;
        String str;
        Calendar calendar = Calendar.getInstance();

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
            System.out.printf("Worker №%d %n", i+1);

            System.out.print("Enter first name: ");
            workers[i].firstName = in.nextLine();

            System.out.print("Enter initials: ");
            workers[i].initials = in.nextLine();

            System.out.print("Enter position: ");
            workers[i].position = in.nextLine();

            try {
                System.out.print("Enter year of employment: ");
                workers[i].yearOfEmployment = in.nextInt();
                str = in.nextLine();
            } catch (Exception e){
                System.out.println("Wrong format entered year " + e.getMessage());
                System.out.println("Entered value is changed to current year");
                workers[i].yearOfEmployment = calendar.get(Calendar.YEAR);
            }

        }
        System.out.println("Enter the minimum experience in years");

        minService = in.nextInt();
        str = in.nextLine();

        int currentYear = calendar.get(Calendar.YEAR);

        System.out.printf("Employees, whose experience is more than %d years %n", minService);
        for (Worker worker : workers) {
            if (currentYear - worker.yearOfEmployment > minService){
                System.out.println(worker.firstName);
                System.out.println(worker.initials);
                System.out.println(worker.position);
                System.out.println(worker.yearOfEmployment);
            }
        }
    }
}
