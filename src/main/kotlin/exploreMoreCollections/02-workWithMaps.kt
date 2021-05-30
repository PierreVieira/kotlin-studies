package exploreMoreCollections

fun main() {
    val videoGamesCollection = mutableMapOf<String, MutableList<String>>()
    println(videoGamesCollection)
    videoGamesCollection["Action"] = mutableListOf("Dark Souls", "Sekiro: Shadows Die Twice")
    videoGamesCollection["Strategy"] = mutableListOf()
    println(videoGamesCollection)
    videoGamesCollection["Strategy"]?.add("Civilisation VI")
    println(videoGamesCollection)

    val removedActionGames = videoGamesCollection.remove("Action")
    println(removedActionGames)
    println(videoGamesCollection)

    val authenticationHeaders = mutableMapOf(
        "API_KEY" to "your-api-key",
        "Authorization" to "auth token",
        "content/type" to "application/json"
    )

    authenticationHeaders["Authorization"] = "new api key"
    videoGamesCollection["Strategy"]?.add("Command & Conquer")
    videoGamesCollection["Shooter"] = mutableListOf("DOOM")

    for (key in videoGamesCollection.keys) {
        println(key)
    }

    for (value in videoGamesCollection.values) {
        println(value)
    }

    for ((key, value) in videoGamesCollection) {
        println("Video games in the $key genre you own are: $value")
    }
}