package metodos;

public class uno {
    static void isFreezing(int temp) {
        if (temp <= 32) {
            System.out.println("its freezing");
        } else {
            System.out.println("its not freezing");
        }

    }

    static void main() {
        isFreezing(32);
        isFreezing(50);
        isFreezing(-10);
    }
}
