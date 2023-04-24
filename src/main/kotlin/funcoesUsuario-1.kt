fun main(){
    print("Digite o 1° número: ")
    val num1 = readln().toInt()
    print("Digite o 2° número: ")
    val num2 = readln().toInt()
    println("A soma é ${soma(num1, num2)}")
}

fun soma(x: Int, y: Int): Int {
    return x + y
}