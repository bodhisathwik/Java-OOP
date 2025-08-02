public class stringimmutability {
    public static void main(String[] args) {
        String str = "hello";
        String newStr = str.concat(" world");
        System.out.println(newStr);

        str = str.concat(" world");
        System.out.println(str);
    }
}