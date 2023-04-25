fun main() {
    val coresRGB = mapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF",
        "preto" to "#000000",
        "branco" to "#FFFFFF"
    )
    if (coresRGB.containsValue("#FF0000")) {
        println("O código RGB #FF0000 existe no Map")
    } else {
        println("O código RGB #FF0000 não existe no Map")
    }
    if (coresRGB.containsKey("vermelho")) {
        println("A cor vermelho existe no Map")
    } else {
        println("A cor vermelho não existe no Map")
    }
    if (coresRGB.any { it.value.startsWith("#00") }) {
        println("Existe pelo menos uma cor com código RGB começando com #00")
    } else {
        println("Não existe nenhuma cor com código RGB começando com #00")
    }

   

}