package manageControlFlow

fun main() {
    val names = listOf("José", "Maria", "Marcos", "Pierre", "João", "Marcelo", "Lucas", "Pamela")
    var i = names.size - 1
    while (i >= 0) {
        print("${names[i]} ")
        i--
    }
}