import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Вычислить площад треугольника");
        Triangle triangle = new Triangle();

        Scanner scan = new Scanner(System.in);

        System.out.print("a: ");
        triangle.a = scan.nextInt();
        System.out.print("b: ");
        triangle.b = scan.nextInt();
        System.out.print("c: ");
        triangle.c = scan.nextInt();

        triangle.area();
    }
}