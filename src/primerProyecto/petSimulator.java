package primerProyecto;

import java.util.Scanner;

public class petSimulator {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        int hunger = 10;
        int energy = 10;
        int social = 10;
        String r;
        System.out.println("Give a name to your cat ");
        String name = sc.nextLine();
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Name of the pet: " + name);
            System.out.println();
            System.out.println(" |\\__/,|   (`\\");
            System.out.println("  |o o  |__ _)");
            System.out.println("_.( T   )  `  /");
            System.out.println("((_ `^--' /_<  \\");
            System.out.println("`` `-'(((/  (((/");
            System.out.println();
            System.out.println("The stats of your cat are these: ");
            System.out.println("Hunger: " + hunger);
            System.out.println("Energy: " + energy);
            System.out.println("Social: " + social);
            System.out.println();
            System.out.println("Choose an action:");
            System.out.println("[P] Play with " + name);
            System.out.println("[E] Feed " + name);
            System.out.println("[EX] Exit");
            r = sc.nextLine();
            switch (r.toLowerCase()) {
                case "p":
                    if (hunger > 15) {
                        System.out.println(name + " Is to hungry to play rn");
                        System.out.println("you should give your pet somem food");
                    } else if (energy < 4) {
                        System.out.println(name + " Is to tired to play rn");
                        System.out.println("you should give your pet somem energy food");
                    } else {
                        hunger += 2;
                        energy -= 1;
                        social += 2;
                    }
                    break;

                case "e":
                    if (hunger < 5) {
                        System.out.println(name + " has no need to eat rn");
                    } else {
                        System.out.println(name + " has replenished energy!!");
                        energy += 2;
                        hunger -= 3;
                        System.out.println(name+" enjoyed the food!");
                    }
                    break;
                case"ex":
                    System.out.println("saliedo del juego...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;

            }

        } while (!r.equalsIgnoreCase("ex"));
        System.out.println("fin de juego");
    }
}
