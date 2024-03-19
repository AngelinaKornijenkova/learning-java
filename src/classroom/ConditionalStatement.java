package classroom;

public class ConditionalStatement {
    public static void main(String[] args) {


        // Conditional statements in Java allow to control the flow of your program based on certain conditions.

        // 'If' statement


        if (true) {
            System.out.println("This code is executed");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        if (x > 12) {
            System.out.println("x is greater than 12");
        }
        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is Spring");
        }
        //IF-ELSE

        //Child: <= 12;
        //Teen: => 13 & <= 19;
        //Adult: => 20 & <= 59;
        //Else: Senior.

        int age = 10;
        if (age <= 12) {
            System.out.println("This is child.");
        } else {
            System.out.println("Semething else!");
        }
        //if-else-if-else
        if (age <= 12) {
            System.out.println("This is child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult.");
        } else {
            System.out.println("This is senior");
        }

        int Number = -2;
        if (Number == 0) {
            System.out.println("is zero");
        } else if (Number <= 0) {
            System.out.println("is negative");
        } else if (Number >= 0) {
            System.out.println("is positive");
        }

        ///* Exercise 2:
        //        Write a Java program that determines the time of day based on given hour:
        //        If the hour is between 0 and 11, will print: Good morning;
        //        If the hour is between 12 and 17, will print: Good afternoon;
        //        If the hour is between 18 and 23, will print: Good evening;
        //         In all other cases should say that: Invalid hour provided;
        //         */

        int hours = 10;
        if(hours >= 0 && hours <= 11) {
            System.out.println("Good morning");
        } else if (hours >= 12 && hours <= 17) {
            System.out.println("Good afternoon");
        } else if (hours >= 18 && hours <= 13) {
            System.out.println("Good evening");
        } else {
            System.out.println("Invalid hour provided" + hours);
        }
    }
}