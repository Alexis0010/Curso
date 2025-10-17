package static1;
import java.util.Scanner;
public class tres {
    static Scanner sc=new Scanner(System.in);
    public static double calcularAreaCirculo(double radio){
        double area=(Math.PI*radio*radio);
        return area;
    }

    static void main() {
        System.out.println("Ingrese el radio de circulo");
        double r= sc.nextDouble();
        double area=calcularAreaCirculo(r);
        System.out.println("el area de tu circulo es: "+area);
    }
}
