package strings_practice;

import java.util.HashMap;
import java.util.Map;

public class ContarCaracteres {
    public static void main(String[] args) {
        String texto = "banana";
        Map<Character, Integer> contador = new HashMap<>();

        for (char c : texto.toCharArray()) {
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }

        contador.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
