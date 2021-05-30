package dataTypesAndOperations

fun main () {
    print("User name 1: ")
    val name1 = readLine()!!
    print("User name 2: ")
    val name2 = readLine()!!
    val sameNameLength = if (name1.length == name2.length) "Yes" else "No"
    println("Same name length? $sameNameLength.")
}