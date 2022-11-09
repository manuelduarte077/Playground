package POO

class Person(var name: String? = "CR7", var passport: String? = null) {
    var alive: Boolean = true

    fun die() {
        alive = false
    }

    fun Person() {
        name = "Messi"
        passport = "123456"
    }


}

