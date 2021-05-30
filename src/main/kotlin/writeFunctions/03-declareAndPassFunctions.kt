package writeFunctions

fun validateString(input: String, inputType: String) = when {
    input.isBlank() -> false
    inputType == "Password" -> input.length >= 10
    inputType == "Email" -> input.contains("@")
    else -> {
        println("Cannot verify this input")
        false
    }
}

fun validateString(input: String, validator: (String) -> Boolean) = when {
    input.isBlank() -> false
    else -> validator(input)
}

fun validatePassword(password: String) = password.length >= 10

fun main() {
    val email = "email@gmail.com"
    val password = "password"

    validateString("Hello World", "Welcome message")

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

//    val isValidPassword = validateString(password) { input -> input.length >= 10 }
    val isValidPassword = validateString(password, ::validatePassword)
    println(isValidPassword)

    val passwordValidator = ::validatePassword
    println(passwordValidator)
}