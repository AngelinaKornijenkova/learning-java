
public class FirstHomeWork {
    public static void main(String[] args) {
        // 1. Positive number.

        int Number = 8;
        if (Number >= 0) {
            System.out.println("Positive number");
        }

        //2. Even number.

        int num = 10;
        if(num % 2 == 0) {
            System.out.println("Even number");
        }

        //3. Teenager or adult.

        int age = 20;
        if(age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        //4. Leap year.

        int year = 1992;
        if(year % 4 == 0) {
            System.out.println("Leap year");
        }

        //5. Valid number.

        int number  = 82;
        if (number > 100){
            System.out.println("!");
        } else if (number < 0){
            System.out.println("-");
        } else if (number % 2 == 0){
            System.out.println("Valid number.");
        }


        //6. Positive and Even.

        int myNumber = 12;
        if (myNumber < 0){
            System.out.println("Positive");
        } else if (myNumber%2==0 ) {
            System.out.println("Positive and Even.");
        }

        //7.




    }
}
