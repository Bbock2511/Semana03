fun main() {
    val numeros = setOf(1, 2, 3, 4, 5)

    if (numeros.contains(3)) {
        println("O número 3 está presente no Set.")
    } else {
        println("O número 3 não está presente no Set.")
    }

    if (4 in numeros) {
        println("O número 4 está presente no Set.")
    } else {
        println("O número 4 não está presente no Set.")
    }
}
