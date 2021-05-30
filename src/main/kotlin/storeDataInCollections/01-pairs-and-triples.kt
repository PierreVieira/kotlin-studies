package storeDataInCollections

fun main() {
    val creditCard = Triple("30301295831", "007", "Visa")
    val bankAccount = Pair(16000.0, creditCard)
    val (balance, card) = bankAccount
    val (cardNumber, securityCode, cardType) = card
    println("The account has R$ $balance, with the cardNumber: $cardNumber and the card type: $cardType")
}