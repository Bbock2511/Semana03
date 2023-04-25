fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5)
    val resultado = transformarLista(numeros) { it * 2 }

    println(resultado)
}

fun transformarLista(array: IntArray, transformacao: (Int) -> Int): List<Int> {
    return array.map(transformacao)
}
