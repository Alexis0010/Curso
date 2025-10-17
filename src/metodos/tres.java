package metodos;

public class tres {
    public static boolean isEqual222(int x, int y, int z) {
        int suma = x + y + z;
        return suma == 222;
    }

    static void main() {
        System.out.println(isEqual222(210, 232, 22));
        System.out.println(isEqual222(50, 2502, 55));
        System.out.println(isEqual222(0, 222, 0));
    }

}
