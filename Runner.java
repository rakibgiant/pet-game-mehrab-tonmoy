package PetGame;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Cat c = new Cat("fluffy", 0, 0, 1000, 1000, "blue");
        Dog d = new Dog("loser", 0, 0, 100, 0, "red");
        Cow co = new Cow("Hambba", 0, 0, 90, 0, "brown");
        Goat g = new Goat("Blary", 0, 0, 80, 0, "black");
        Lamb l = new Lamb("Black sheap", 0, 0, 97, 0, "brown");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an animal:\t");
        String animal = scanner.nextLine();

        if (animal.equals("dog")) {
            System.out.println("The name of this animal is " + "" + d.getName());
            System.out.println("The tired level of this animal is " + "" + d.getTiredLevel());
            System.out.println("The hungry level of this animal is " + "" + d.getHungryLevel());
            System.out.println("The cuteness level of this animal is " + "" + d.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + d.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + d.getEyeColor());
        } else if (animal.equals("cat")) {
            System.out.println("The name of this animal is " + "" + c.getName());
            System.out.println("The tired level of this animal is " + "" + c.getTiredLevel());
            System.out.println("The hungry level of this animal is " + "" + c.getHungryLevel());
            System.out.println("The cuteness level of this animal is " + "" + c.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + c.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + c.getEyeColor());
        } else if (animal.equals("cow")) {
            System.out.println("The name of this animal is " + "" + co.getName());
            System.out.println("The tired level of this animal is " + "" + co.getTiredLevel());
            System.out.println("The hungry level of this animal is " + "" + co.getHungryLevel());
            System.out.println("The cuteness level of this animal is " + "" + co.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + co.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + co.getEyeColor());
        } else if (animal.equals("goat")) {
            System.out.println("The name of this animal is " + "" + g.getName());
            System.out.println("The tired level of this animal is " + "" + g.getTiredLevel());
            System.out.println("The hungry level of this animal is " + "" + g.getHungryLevel());
            System.out.println("The cuteness level of this animal is " + "" + g.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + g.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + g.getEyeColor());
        } else if (animal.equals("lamb")) {
            System.out.println("The name of this animal is " + "" + l.getName());
            System.out.println("The tired level of this animal is " + "" + l.getTiredLevel());
            System.out.println("The hungry level of this animal is " + "" + l.getHungryLevel());
            System.out.println("The cuteness level of this animal is " + "" + l.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + l.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + l.getEyeColor());
        } else {
            System.out.println("That animal is not in the database yet");
        }

    }
}
