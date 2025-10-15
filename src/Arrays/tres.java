package Arrays;

public class tres {
    static void main() {
        //we can also change the array
        String[] champions = {"Jinx", "Vi", "Caitlyn", "Ekko", "Jayce", "Viktor", "Heimerdinger"};

        champions[0] = "Powder";
//it erases "jinx" from the existence of the array
        System.out.println(champions[0]); // Powder
        System.out.println(champions[1]); // Powder
        System.out.println(champions[2]); // Powder
        System.out.println(champions[3]); // Powder
        System.out.println(champions[4]); // Powder
        System.out.println(champions[5]); // Powder
        System.out.println(champions[6]); // Powder
        // Powder
        //another way to add is to create an empty array:
        int[] emptyArray = new int[5]; // Creates an empty int array with 5 elements

        emptyArray[0] = 100;//here we are creting position 0, in the basic way it would look like this
        //int[] emptyArray ={100}
        emptyArray[1] = 200;
        //int[] emptyArray ={100,200}

        System.out.println(emptyArray[0]); // 100
        System.out.println(emptyArray[1]); // 200

    }
}
