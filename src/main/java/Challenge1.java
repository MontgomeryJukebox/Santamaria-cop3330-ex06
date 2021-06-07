/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */

import java.util.Calendar;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("What is your current age?");
        int age = in.nextInt();
        System.out.print("At what age would you like to retire?");
        int hope = in.nextInt();
        int diff = hope - age;
        if (diff <= 0) {
            System.out.println("You can already retire");
        }
        System.out.println("You have " + diff + " years until you can retire.");
        System.out.println("It's " + Calendar.getInstance().get(Calendar.YEAR) + ", so you can retire in " + (Calendar.getInstance().get(Calendar.YEAR) + diff));
    }
}