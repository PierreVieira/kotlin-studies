package exploreMoreCollections

fun main() {
    val userIds = setOf("ID1B", "ID2C", "ID3F", "ID8I")
    println(userIds)
    println(userIds.contains("ID3F"))
    println("ID1B" in userIds)

    val mutableIds = userIds.toMutableSet()

    println(mutableIds.add("ID02"))
    println(mutableIds)

    println(mutableIds.add("ID1B"))
    println(mutableIds)

    println(mutableIds.remove("ID1B"))
    for (userId in mutableIds) {
        println(userId)
    }

    val names = arrayOf("Phillip", "Mark", "Brian", "Joe", "Ted", "John", "Phillip")
    println(names)

    val uniqueNames = names.toSet()
    println(uniqueNames)
}