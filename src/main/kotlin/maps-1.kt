fun main() {
    val coresRGB = hashMapOf(
        "vermelho" to listOf(255, 0, 0),
        "verde" to listOf(0, 255, 0),
        "azul" to listOf(0, 0, 255),
        "preto" to listOf(0, 0, 0),
        "branco" to listOf(255, 255, 255)
    )

    println("Cores e seus respectivos códigos RGB:")
    for ((cor, rgb) in coresRGB) {
        println("$cor: (${rgb[0]}, ${rgb[1]}, ${rgb[2]})")
    }
}
