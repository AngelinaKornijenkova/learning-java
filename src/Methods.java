public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44,20));

        int summa = calculateSum(10, 24);

        // Print Hello world 10 times
        printTextMultipleTimes("Hello World!", 10);

        String[] fruits = {"Kivi","Banana","Mango","Pear"};
        printAllValuesFromStringArray(fruits);

        System.out.println(isEven(10));
        System.out.println(isEven(11));

        System.out.println(summTask(15,28));

        int[] numbers = {2,4,7,5,9};
        int arraySome = printTheSame(numbers);
        System.out.println(arraySome);


    }

    public static int printTheSame(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];

        }
        return summa;
    }


    public static int calculateSum(int x, int y) {
        return x+ y;

    }

    public static void printTextMultipleTimes(String text, int repeatCount){
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
            
        }

    }

    //Task: create method that receives String array and print all values.
    public static void printAllValuesFromStringArray(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);

        }
    }

    //Task: Create method that will return true if number is even or false if odd;

    public static boolean isEven(int number){
        boolean result = number % 2 == 0;
        return result;
    }

    //Task: create method that accept int array and return summ of number;



    public static int summTask(int a, int b) {
        return a + b;
    }




}
