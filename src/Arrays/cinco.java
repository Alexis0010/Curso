package Arrays;
import java.util.Arrays;
public class cinco {
    static void main() {
        int[] numbers = {4, 2, 7, 1};
        Arrays.sort(numbers); // [1, 2, 4, 7]
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println();
        String[] nombres={"alexis","juan","carlos"};
        Arrays.sort(nombres);
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        //also we can do logical things with arrays, such as comparing them
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {3, 2, 1};
        System.out.println();
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(b,c));
        System.out.println();
        //practical example
        int[] playlistA = {
                3094234, 12323, 90990, 373737, 128732, 4388934, 2343947, 6548234, 234823, 4568,
                2345234, 234234, 678768, 6456, 787, 46456, 678567, 354345, 23423, 645745, 23423,
                2435423, 786768, 678786
        };

        int[] playlistB = {
                234823, 678786, 354345, 3094234, 6456, 678567, 23423, 786768,
                46456, 128732, 6548234, 234234, 4568, 4388934, 23423, 12323,
                2343947, 2435423, 645745, 678768, 2345234, 90990, 373737, 787
        };
        Arrays.sort(playlistA);
        Arrays.sort(playlistB);
        if (Arrays.equals(playlistA,playlistB)) {
            System.out.println("Same array");
        }else {
            System.out.println("Different array");
        }
    }
}
