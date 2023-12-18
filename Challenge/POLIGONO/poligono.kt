fun calcularAreaPoligono(tipo: String, vararg args: Double): Double? {
    when (tipo.toLowerCase()) {
        "triangulo" -> {
            if (args.size == 2) {
                val base = args[0]
                val altura = args[1]
                val area = 0.5 * base * altura
                println("Área del triángulo: $area")
                return area
            }
        }
        "cuadrado" -> {
            if (args.size == 1) {
                val lado = args[0]
                val area = lado * lado
                println("Área del cuadrado: $area")
                return area
            }
        }
        "rectangulo" -> {
            if (args.size == 2) {
                val base = args[0]
                val altura = args[1]
                val area = base * altura
                println("Área del rectángulo: $area")
                return area
            }
        }
    }
    
    println("Tipo de polígono no soportado o número incorrecto de argumentos.")
    return null
}

fun main() {
    // Ejemplos de uso
    calcularAreaPoligono("triangulo", 4.0, 6.0)
    calcularAreaPoligono("cuadrado", 5.0)
    calcularAreaPoligono("rectangulo", 3.0, 8.0)
}
