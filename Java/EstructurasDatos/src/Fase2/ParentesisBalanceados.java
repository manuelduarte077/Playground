package Fase2;

// Verificar si una cadena tiene paréntesis balanceados (usando Stack)

public class ParentesisBalanceados {
    public static boolean estaBalanceado(String expresion) {
        MiStack pila = new MiStack(); // Usamos una pila para almacenar los paréntesis abiertos

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(1); // Usamos cualquier valor para representar un paréntesis
            } else if (c == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }
        }

        return pila.isEmpty(); // Si está vacía, están balanceados
    }

    public static void main(String[] args) {
        System.out.println(estaBalanceado("(())"));    // true
        System.out.println(estaBalanceado("(()"));     // false
        System.out.println(estaBalanceado("(()())"));  // true
    }
}
