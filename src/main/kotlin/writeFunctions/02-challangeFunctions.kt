package writeFunctions

fun howLongPersonName(name: String, lastName: String = "") = "$name $lastName = ${name.length + lastName.length} characters."

fun main() {
    println(howLongPersonName("Pierre", "Vieira"))
}