package exploreMoreCollections

fun main() {
    val videoGameCollection = mutableMapOf<String, MutableList<String>>()
    println(videoGameCollection)
    videoGameCollection["Action"] = mutableListOf("Dark Souls", "Sekiro: Shadows Die Twice")
    println(videoGameCollection)
    val actionGames = videoGameCollection["Action"]
    println(actionGames)
    val strategyGames = videoGameCollection["Strategy"]
    println(strategyGames)
    val authenticationHeaders = mapOf(
        "API_KEY" to "your-api-key",
        "Authorization" to "auth token",
        "content/type" to "application/json"
    )
    println(authenticationHeaders)
}