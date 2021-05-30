package storeDataInCollections

fun main() {
    val array = arrayOf("DBZ BTK 3", "GOW", "GOW 2", "GOW 3", "GTA")
    array[1] = "The Sims"
    println(array[1])
    val mutableList = array.toMutableList()
    mutableList.addAll(listOf("Scarface", "Hitman"))
    mutableList.remove("DBZ BTK 3")
    print(mutableList)
}