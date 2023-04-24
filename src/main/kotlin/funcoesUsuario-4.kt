fun maxNumber(numbers: IntArray): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun main(){
    val numbers = intArrayOf(10, 5, 20, 15, 30)
    println("O maior número do array é: ${maxNumber(numbers)}")
}