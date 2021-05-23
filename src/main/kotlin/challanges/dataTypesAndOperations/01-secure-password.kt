package challanges.dataTypesAndOperations
fun main() {
    print("Password: ")
    println("Secure password? ${if (readLine()!!.length >= 10) "Yes" else "No"}.")
}
