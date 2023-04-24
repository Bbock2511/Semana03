fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5)
val n = 3

println(maioresQueN(numeros, n))    
}

fun maioresQueN(array: IntArray, n: Int): List<Int> {
    return array.filter { it > n }
}
