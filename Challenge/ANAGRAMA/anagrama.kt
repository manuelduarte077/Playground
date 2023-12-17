fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
    // Convertimos las palabras a minúsculas y eliminamos espacios en blanco
    val palabra1 = palabra1.toLowerCase().replace(" ", "")
    val palabra2 = palabra2.toLowerCase().replace(" ", "")

    // Verificamos si las palabras tienen la misma longitud
    if (palabra1.length != palabra2.length) {
        return false
    }

    // Ordenamos las letras de ambas palabras y comparamos
    val sortedPalabra1 = palabra1.toCharArray().sorted().joinToString("")
    val sortedPalabra2 = palabra2.toCharArray().sorted().joinToString("")

    return sortedPalabra1 == sortedPalabra2
}

fun main() {
    // Ejemplos de uso
    val resultado1 = sonAnagramas("listen", "silent")
    println(resultado1)  // true

    val resultado2 = sonAnagramas("hello", "world")
    println(resultado2)  // false
}
