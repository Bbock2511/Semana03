fun main(){
    print("Digite um número: ")
    val num = readln().toInt()
    println("O número é ${verificacao(num)}")
}

fun verificacao(x: Int): String = if(x % 2 == 0){
    "par"
}
else{
    "Ímpar"
}