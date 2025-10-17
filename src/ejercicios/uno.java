package ejercicios;

import java.util.Scanner;

public class uno {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        System.out.println("dime un numero porfavor.");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
