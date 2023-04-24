fun main(){
    print("Digite uma string: ")
    val input = readln()
    println("A palavra é políndromo? ${isPolindrome(input)}")
}

fun isPolindrome(str: String): Boolean{
    val reversedStr = str.reversed()
    return str == reversedStr
}