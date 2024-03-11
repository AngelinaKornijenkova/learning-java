import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //Array
        //Bread; Milk; Eggs; Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7,9,10,6,5,4};

        String[] seasons = {"Summer", "winter", "Spring", "Autumn"};
        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        //Print all grades
        System.out.println(Arrays.toString(grades));


        System.out.println(grades[5]);

        //Create empty array;
        int[] emptyArray = new int[4];
        //[0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        // Create String array with names;
        // Name count should be 5;
        // And print them all;

        String[] names = {"Angelina", "Mariam", "Virginija", "Ripsime", "Elizabet"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // Create empty double array with size of 5;
        // Print empty array
        // Update each array value from 0 to a number of your choice;
        // Print them all

        double[] emptyArraysDouble = new double[5];
        System.out.println(Arrays.toString(emptyArraysDouble));
        emptyArraysDouble[0] = 2.17;
        emptyArraysDouble[1] = 4.24;
        emptyArraysDouble[2] = 7.58;
        emptyArraysDouble[3] = 5.63;
        emptyArraysDouble[4] = 8.55;
        System.out.println(Arrays.toString(emptyArraysDouble));

        //Print numbers from 0 to 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Calculate num from 1 to 100;
        //Exemple: 1+2+3+...+n
        int summa = 0;
        for (int i = 1; i <=100 ; i++) {
            summa = summa + i;
        }
        System.out.println("Sum:" + summa);

        //for ->
        for(int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        for (String s : shoppingList) {
            System.out.println(s);
        }


        // Print numbers from 10 to 0

        for(int i = 10; i>=0; i--){
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter--;
        }

        //Exercise

        for(int i = 2; i<=100; i = i+2){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 2; i <=100 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        








    }
}
