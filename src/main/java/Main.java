import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your current age?");
        int age = in.nextInt();
        System.out.print("At what age would you like to retire?");
        int expected_retirement = in.nextInt();
        System.out.println("You have " + (expected_retirement - age) + " years left until you can retire.");
        System.out.println("It's " + Calendar.getInstance().get(Calendar.YEAR) + ", so you can retire in " + (Calendar.getInstance().get(Calendar.YEAR) + (expected_retirement - age)));
    }
}
