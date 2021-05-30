package dataTypesAndOperations

fun main() {
    print("User name: ")
    val userName = readLine()!!
    print("Password: ")
    val password = readLine()!!
    print("Email: ")
    val email = readLine()!!
    val valid = userName.length >= 6 && password.length >= 10 && email.contains("@")
    println("Data is valid? ${if (valid) "Yes" else "No"}.")
}