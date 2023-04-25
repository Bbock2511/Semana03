fun main() {
    val strings = arrayOf("banana", "Maçã", "casa", "Café", "Amora", "abacate")
    val caractere = 'c'
    val stringsIniciandoComC = stringsQueIniciamComCaractere(strings, caractere)

    println("Strings que iniciam com o caractere '$caractere': $stringsIniciandoComC")
}

fun stringsQueIniciamComCaractere(strings: Array<String>, caractere: Char): List<String> {
    return strings.filter { it.startsWith(caractere, ignoreCase = true) }
}
