package manageControlFlow

fun main() {
    val year = 2002
    println(
        when (year) {
            in 2000..2020 -> "21st century!"
            in 1900..1999 -> "20th century!"
            in 1800..1899 -> "19th century!"
            else -> "That was loong ago!"
        }
    )
}