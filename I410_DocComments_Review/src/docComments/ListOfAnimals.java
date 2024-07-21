package docComments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The {@code ListOfAnimals} class provides a menu-driven application to manage
 * a list of animals. Users can view all animals, add a new animal, find an animal
 * by ID, delete an animal by ID, and count the total number of animals.
 */
public class ListOfAnimals {

    /**
     * Counts the number of animals in the list.
     *
     * @param animals the list of animals
     * @return the number of animals in the list
     */
    public static int countAnimals(ArrayList<Animal_Trackers> animals) {
        return animals.size();
    }

    /**
     * Displays the menu options to the user.
     */
    public static void Options() {
    	System.out.println();
        System.out.println("1. Show All Animals");
        System.out.println("2. Add an Animal");
        System.out.println("3. Find an Animal");
        System.out.println("4. Delete an Animal");
        System.out.println("5. Number of Animals");
        System.out.println("6. Exit");
        System.out.println("7. Enter your selection");
    }

    /**
     * The main method of the application, providing a menu-driven interface
     * for managing a list of animals.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Animal_Trackers> animals = new ArrayList<>();

        // Creating some initial animal objects and adding them to the list
        Animal_Trackers animal1 = new Animal_Trackers("Elephant", "Tracker Dart", "Blue");
        Animal_Trackers animal2 = new Animal_Trackers("Tiger", "Collar", "Red");
        Animal_Trackers animal3 = new Animal_Trackers("Cow", "Leg Collar", "Purple");
        Animal_Trackers animal4 = new Animal_Trackers("Eagle", "Injection Tracker", "Clear");

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        ListOfAnimals.Options();

        String userChoice = scan.nextLine();
        System.out.println();
        while (!userChoice.equals("6")) {

            if (userChoice.equals("1")) {
                for (Animal_Trackers animal : animals)
                    System.out.println(animal.getAnimal() + " " + animal.getColor() + " " + animal.getTracker() + " " + animal.getId());

                ListOfAnimals.Options();
                System.out.println();
                userChoice = scan.nextLine();
            } else if (userChoice.equals("2")) {
                System.out.println("Enter animal name:");
                String addA = scan.nextLine();

                System.out.println("Enter Tracker device:");
                String addT = scan.nextLine();

                System.out.println("Enter color:");
                String color = scan.nextLine();

                Animal_Trackers animal = new Animal_Trackers(addA, addT, color);
                animals.add(animal);
                ListOfAnimals.Options();
                userChoice = scan.nextLine();
            } else if (userChoice.equals("3")) {
                System.out.println("Enter the ID of the animal to find:");
                int idToFind = Integer.parseInt(scan.nextLine());

                boolean found = false;
                for (Animal_Trackers animal : animals) {
                    if (animal.getId() == idToFind) {
                        System.out.println(animal.getAnimal() + " " + animal.getTracker() + " " + animal.getColor());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Animal with ID " + idToFind + " not found.");
                }

                ListOfAnimals.Options();
                userChoice = scan.nextLine();
            } else if (userChoice.equals("4")) {
                System.out.println("Enter the ID of the animal to delete:");
                int idToDelete = Integer.parseInt(scan.nextLine());

                Animal_Trackers animalToDelete = null;
                for (Animal_Trackers animal : animals) {
                    if (animal.getId() == idToDelete) {
                        animalToDelete = animal;
                        break;
                    }
                }
                if (animalToDelete != null) {
                    animals.remove(animalToDelete);
                    System.out.println("Animal with ID " + idToDelete + " has been deleted.");
                } else {
                    System.out.println("Animal with ID " + idToDelete + " not found.");
                }

                ListOfAnimals.Options();
                userChoice = scan.nextLine();
            } else if (userChoice.equals("5")) {
                System.out.println("Number of animals: " + ListOfAnimals.countAnimals(animals));
                ListOfAnimals.Options();
                userChoice = scan.nextLine();
            } else if (userChoice.equals("6")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
                ListOfAnimals.Options();
                userChoice = scan.nextLine();
            }
        }

        System.out.println("Goodbye");
        scan.close();
    }
}
