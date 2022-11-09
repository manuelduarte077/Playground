import POO.Person

fun main() {

    /// Objeto que Instancia de la Clase Person
    val person = Person("Manuel", "12345678")
    var anonimo = Person()

    println(person.alive)
    person.die()
    println(person.alive)

    /// Contructores
    anonimo.Person()
    println(anonimo.alive)
    println(anonimo.name)
    println(anonimo.passport)

    anonimo = Person()
    print(anonimo.name)

}
