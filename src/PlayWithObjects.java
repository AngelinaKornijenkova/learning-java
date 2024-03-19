public class PlayWithObjects {
    public static void main(String[] args) {

        Animal Gamma = new Animal();
        System.out.println(Gamma.getName());

        Gamma.setName("Gamma");
        Gamma.setAge(7);
        Gamma.setColor("ginger");
        System.out.println(Gamma.getName());

        Animal Leon = new Animal();
        Leon.setName("Leon");
        Leon.setAge(8);
        Leon.setColor("ginger");
        System.out.println(Leon.getName());

        System.out.println(Gamma);
        System.out.println(Leon);

        Gamma.walk();
        Leon.walk();

        Gamma.eat();
        Leon.eat();

        //Create 2 objects
        //Update information for each
        //Call walk and eat

        Animal Kristal = new Animal();
        Kristal.setName("Kristal");
        Kristal.setAge(5);
        Kristal.setColor("grey");
        System.out.println(Kristal.getName());
        System.out.println(Kristal);

        Animal Barsik = new Animal();
        Barsik.setName("Barsik");
        Barsik.setAge(17);
        Barsik.setColor("ginger");
        System.out.println(Barsik);

        Kristal.walk();
        Barsik.walk();

        Kristal.eat();
        Barsik.eat();


        




    }
}
