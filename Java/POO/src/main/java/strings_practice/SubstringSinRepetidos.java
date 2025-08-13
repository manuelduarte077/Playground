package strings_practice;

import java.util.HashSet;
import java.util.Set;

public class SubstringSinRepetidos {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int izquierda = 0, maxLen = 0;

        for (int derecha = 0; derecha < s.length(); derecha++) {
            while (set.contains(s.charAt(derecha))) {
                set.remove(s.charAt(izquierda));
                izquierda++;
            }
            set.add(s.charAt(derecha));
            maxLen = Math.max(maxLen, derecha - izquierda + 1);
        }

        System.out.println("Longitud máxima: " + maxLen); // 3
    }
}