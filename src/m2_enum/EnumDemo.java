package m2_enum;

import java.util.Arrays;

import static m2_enum.Day.*;

public class EnumDemo {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        System.out.println(day);

        Day[] days = Day.values();// Day.values() return an array of Day data type
        System.out.println(Arrays.toString(days));
        System.out.println("----------------------------");

        // using switch statement
        switch(day){
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday ");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is Saturday");

        }
    }
}
