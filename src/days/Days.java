package days;

import java.util.Scanner;

enum Day {
    ONE("Monday"), TWO("Tuesday"), THREE("Wednesday"), FOUR("Thursday"), FIVE("Friday");

    private final String dayName;

    // Constructor to initialize dayName
    Day(String dayName) {
        this.dayName = dayName;
    }

    // Getter method to retrieve dayName
    public String getDayName() {
        return dayName;
    }
}

public class Days {

    public static void main(String[] args) {
        System.out.println("All the day names:");

        // Loop through each day enum constant and print its name
        for (Day day : Day.values()) {
            // Print the enum constant name followed by its corresponding day name
            System.out.println(day + ": " + day.getDayName());
        }
    }
}
