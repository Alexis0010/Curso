package static1;

import java.util.Scanner;

public class uno {
    static Scanner sc = new Scanner(System.in);

    static void saludarPersona(String nombre) {
        System.out.println("hola " + nombre + "!!!");
    }

    static void main() {
        System.out.println("dime tu nombre");
        String nombre = sc.nextLine();
        saludarPersona(nombre);
    }
}
