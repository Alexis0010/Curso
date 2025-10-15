package control;
import java.util.Scanner;

public class uno {
    static Scanner sc = new Scanner(System.in);
    static void main() {
        int score=85;
        if (score>65){
            System.out.println("u pass the exam");

        }
        int peppers;
        System.out.println("dime cuantos pimientos tienes");
        peppers = sc.nextInt();
        boolean isSpicy=peppers>3;
        if (isSpicy){
            System.out.println("the food is spicy boss");
        }else{
            System.out.println("the food has low spicy levels boss");
        }
        sc.nextLine();
        String cat;

        System.out.println("do u have a cat?");
        cat = sc.nextLine();
        boolean isCatOwner=cat.equalsIgnoreCase("yes");
        if (isCatOwner){
            System.out.println("since you have a cat you can use a 20% discount on your buy with the use of this code MEOW2025");
        }else{
            System.out.println("oh man thats a pitty u are missing on a 20% off");
        }





    }
}
