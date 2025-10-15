package Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class cuatro {
    static void main() {
        String[] films={"pokemon1","pokemon2","pokemon3"};
        System.out.println(films.length);


        //also we can do some pretty stuff with for
        for (int i = 0; i < films.length; i++) {//we can display the films on the array
            System.out.println(films[i]);
        }
        System.out.println();
        //we can also do it backwards
        for (int i = films.length-1; i >=0 ; i--) {
            System.out.println(films[i]);
        }
        int[] keys = {2348, 2345823, 654, 30458, 5049, 589458, 3248238,  2374, 4234, 87756, 45654, 4654, 4566, 465465, 908, 798, 678, 67856785, 100, 234852, 23485, 456654, 543, 324534, 45678, 354, 345423, 23423, 5685, 98567, 23465, 6987, 456, 456, 798};
        for (int i = 0; i < keys.length ; i++) {
            if(keys[i]==100){
                System.out.println("the key is the position "+i);
                System.out.println("u found the number congrats");
                break;
            }

        }




    }




}
