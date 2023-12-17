fn son_anagramas(palabra1: &str, palabra2: &str) -> bool {
    // Convertimos las palabras a minúsculas y eliminamos espacios en blanco
    let palabra1 = palabra1.to_lowercase().replace(" ", "");
    let palabra2 = palabra2.to_lowercase().replace(" ", "");

    // Verificamos si las palabras tienen la misma longitud
    if palabra1.len() != palabra2.len() {
        return false;
    }

    // Ordenamos las letras de ambas palabras y comparamos
    let sorted_palabra1: String = palabra1.chars().sorted().collect();
    let sorted_palabra2: String = palabra2.chars().sorted().collect();

    sorted_palabra1 == sorted_palabra2
}

fn main() {
    // Ejemplos de uso
    let resultado1 = son_anagramas("listen", "silent");
    println!("{}", resultado1); // true

    let resultado2 = son_anagramas("hello", "world");
    println!("{}", resultado2); // false
}
