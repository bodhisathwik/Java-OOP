public class wideningtype {
    public static void main(String[] args) {
        int num = 123;
        long longNum = num;
        float floatNum = longNum;

        System.out.println("Original int value   : " + num);
        System.out.println("After widening to long : " + longNum);
        System.out.println("After widening to float: " + floatNum);

        // Check if data is lost
        if (num == (int)floatNum) {
            System.out.println("No data is lost during widening conversion.");
        } else {
            System.out.println("Data is lost during widening conversion.");
        }
    }
}