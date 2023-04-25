fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val n = 3
    val multiplos = multiplosDeN(array, n)

    println("Elementos nas posições múltiplas de $n: $multiplos")
}

fun multiplosDeN(array: IntArray, n: Int): List<Int> {
    return array.filterIndexed { index, _ -> (index + 1) % n == 0 }
}
