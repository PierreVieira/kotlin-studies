package exploreMoreCollections

fun main() {
    val animalsMap = mutableMapOf(
        "principe" to "dog",
        "bem vinda" to "cat",
        "toby" to "dog",
        "mimo" to "fish"
    )
    animalsMap.remove("toby")
    for ((key, value) in animalsMap) {
        println("My name is $key and i'm a $value")
    }
}