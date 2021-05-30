package exploreMoreCollections

fun main() {
    val itemsOnTheTable = listOf("computer", "mouse", "mousepad", "keyboard", "webcam", "phone", "charger", "phone")
    val setItems = itemsOnTheTable.toMutableSet()
    setItems.remove("webcam")
    for (item in setItems) {
        println(item)
    }
}

