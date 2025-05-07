package TechnicalTests;

public class StringReversal {

    public static void main(String[] args) {
        String input = "Hola";
        StringReversal sr = new StringReversal();

        System.out.println("Input: " + input);
        System.out.println("Reversed: " + sr.reverseString(input));
    }

    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}