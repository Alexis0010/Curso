package metodos;

public class dos {
    public static boolean isEven(int a) {//comprobador de numeros pares
        return (a % 2 == 0);
    }

    static void main() {
        System.out.println(isEven(8));
        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }
}
