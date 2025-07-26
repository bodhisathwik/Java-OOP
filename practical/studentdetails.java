import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("\n--- Student Details ---");
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Roll Number: %d%n", rollNumber);
        System.out.printf("Age        : %d%n", age);
        System.out.printf("Gender     : %c%n", gender);
        System.out.printf("Percentage : %.2f%%%n", percentage);

        sc.close();
    }
}