import java.util.Scanner;

public class areaandcircum {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        sc.close();
    }
}