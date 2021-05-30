package manageControlFlow

fun main() {
    val dimension = 3
    val matrix = Array(dimension) {Array(dimension) {'.'} }
    matrix[1][1] = 'x'
    for (i in 0 until dimension) {
        for (j in 0 until dimension) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}