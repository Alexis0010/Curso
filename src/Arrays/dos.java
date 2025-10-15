package Arrays;

public class dos {
    static void main() {
        String[] continents = {"Asia", "Africa", "North America", "South America", "Australia", "Europe", "Antarctica"}; // Total Length: 7
        //that means that asia is position nmr 0 and antartica is nmr 6
        System.out.println(continents[0]);
        System.out.println(continents[1]);
        System.out.println(continents[2]);
        System.out.println(continents[3]);
        System.out.println(continents[4]);
        System.out.println(continents[5]);
        System.out.println(continents[6]);
        //now let's try this:
        //System.out.println(continents[7]);
        //if we try that the running process will show smth like this: Africa
        //North America
        //South America
        //Australia
        //Europe
        //Antarctica
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
        //	at Arrays.dos.main(dos.java:15)
        //
        //Process finished with exit code 1
        //that's because position seven never existed.

    }
}
