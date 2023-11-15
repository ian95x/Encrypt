fun encryptCaesarCipher(plainText: String, shift: Int): String {
    return plainText.map { char ->
        if (char.isLetter()) {
            val base = if (char.isUpperCase()) 'A' else 'a'
            val newPosition = ((char - base + shift) % 26)
            val encryptedChar = (base + newPosition).toChar()
            encryptedChar
        } else {
            char
        }
    }.joinToString("")
}

fun main() {
    println("Enter the plain text:")
    val plainText = readLine() ?: ""

    println("Enter the shift value:")
    val shift = readLine()?.toIntOrNull() ?: 0

    if (plainText.isNotEmpty()) {
        val encryptedText = encryptCaesarCipher(plainText, shift)
        println("Encrypted Text: $encryptedText")
    } else {
        println("Plain text cannot be empty.")
    }
}
