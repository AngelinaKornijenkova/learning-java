package classroom;

import java.util.Locale;

public class LearnString {
    public static void main(String[] args) {
        // String

        String name  = "Angelina";
        String LastName = "Kornijenkova";
        System.out.println(name);
        System.out.println(LastName);

        //Print name and surname (Example: John Doe)

        String fullName = name + " " + LastName;
        System.out.println(fullName);

        System.out.println(fullName + " " + LastName);

        System.out.println(String.format("%s %s", name, LastName));

        //hello,world

        String Hello = "Hello,";
        String World = "World!";

        String HelloWorld = Hello.concat(World);
        System.out.println(HelloWorld);

        //Exercise
        String Name = "My name is Angelina.";
        String proglang = "I like coding in Java";
        String.format("%s %s",Name,proglang);
        System.out.println(String.format("%s %s",Name,proglang));

        String sms = "angelina";
        System.out.println(sms.toUpperCase(Locale.ROOT));





    }
}
