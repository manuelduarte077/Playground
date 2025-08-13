package strings_practice;

import java.util.Arrays;

public class Anagramas {
    public static void main(String[] args) {
        String palabra1 = "amor";
        String palabra2 = "roma";

        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean esAnagrama = Arrays.equals(arr1, arr2);
        System.out.println(esAnagrama); // true
    }
}