package challanges.dataTypesAndOperations

fun main() {
    print("Password: ")
    val password = readLine()
    println(
        password?.let {
            if (it.isEmpty()) "Ehm, you need a password to keep safe!"
            else when {
                it.length < 6 -> "Weak password! Try again a few more symbols to it!"
                it.length < 10 -> "Medium-strength password."
                it.length < 15 -> "No one is getting through this!"
                else -> "Ironclad"
            }
        } ?: "Ehm, you need a password to keep safe!"
    )
}