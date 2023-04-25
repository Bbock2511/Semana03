fun main() {
    val notas = mutableMapOf(
        "João" to 8.5,
        "Maria" to 7.0,
        "Pedro" to 9.0,
        "Ana" to 6.5,
        "Lucas" to 10.0
    )

    println("Notas originais: $notas")

    notas.remove("Ana")

    println("Notas após remover Ana: $notas")
}
