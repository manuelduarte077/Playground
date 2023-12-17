func sonAnagramas(_ palabra1: String, _ palabra2: String) -> Bool {
    // Convertimos las palabras a minúsculas y eliminamos espacios en blanco
    let palabra1 = palabra1.lowercased().replacingOccurrences(of: " ", with: "")
    let palabra2 = palabra2.lowercased().replacingOccurrences(of: " ", with: "")

    // Verificamos si las palabras tienen la misma longitud
    guard palabra1.count == palabra2.count else {
        return false
    }

    // Ordenamos las letras de ambas palabras y comparamos
    let sortedPalabra1 = String(palabra1.sorted())
    let sortedPalabra2 = String(palabra2.sorted())

    return sortedPalabra1 == sortedPalabra2
}

// Ejemplos de uso
let resultado1 = sonAnagramas("listen", "silent")
print(resultado1)  // true

let resultado2 = sonAnagramas("hello", "world")
print(resultado2)  // false
