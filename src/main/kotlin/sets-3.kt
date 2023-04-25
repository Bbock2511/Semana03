fun main() {
    val numeros = mutableSetOf(1, 2, 3, 4, 5)

    println("Set antes da remoção: $numeros")

    numeros.remove(3)

    println("Set depois da remoção: $numeros")
}
