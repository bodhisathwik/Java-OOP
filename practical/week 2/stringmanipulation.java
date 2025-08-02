import java.util.Scanner;

public class stringmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("Length: " + str.length());

        sc.close();
    }
}