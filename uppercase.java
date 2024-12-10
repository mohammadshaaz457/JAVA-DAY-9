public class uppercase {
    public static void main(String[] args) {
        String str = "hello world";
        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr); // prints "HELLO WORLD"

        char c = 'a';
        char upperCaseC = Character.toUpperCase(c);
        System.out.println(upperCaseC); // prints 'A'
    }
}