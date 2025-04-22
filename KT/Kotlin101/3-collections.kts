/*: * Collections
 Kotlin includes several collections ready to use, here just the ones we will use
*/

// Lists, we use List<Type> and the type of the collection inside the generic
// The literal uses the listOf constructor
// ["Argentina" "Costa Rica"]
val countries: List<String> = listOf("Argentina", "Brazil", "Canada", "Nicaragua")
// countries is IMMUTABLE!

// If you want a mutable List, you have to use MutableList and mutableListOf constructor
val cities: MutableList<String> = mutableListOf("Alameda", "Buenos Aires", "Cali")
cities.add("Managua")

// We also have sets and maps (dictionaries)
// When we talk to the Android SDK sometimes we need to use Java arrays
val strings = hashSetOf("a", "b", "c", "c")
val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
val javaArray = arrayOf(countries)
