public class DataTypes {
    public static void main(String[] args) {
        //first comment
        /* HelloWorld
        I'm working on this file
         */
        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);
        //variables: double
        double temperature = 3.4;
        double price = 30.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: flout
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise:
        char a = 97;
        System.out.println(a);
        char n = 110;
        System.out.println(n);
        char g = 103;
        System.out.println(g);
        char e = 101;
        System.out.println(e);
        char l = 108;
        System.out.println(l);
        char i = 105;
        System.out.println(i);
        System.out.println(n);
        System.out.println(a);

        //Boolean is / has (T/F)

        boolean isRaining = false;
        boolean hasPassedExercise = false;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);


    }
}
