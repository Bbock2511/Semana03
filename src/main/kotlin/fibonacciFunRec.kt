/*função fibonacci(n)
    se n <=1 então 
        retorne n
    senão
        retorne fibonacci(n - 1) + fibonacci(n-2)*/

fun main() {
    val n = 5
    val resultado = fibonacci(n)

    println(" O ${n}º termo da sequência de Fibonacci é $resultado")
}

fun fibonacci(n: Int): Int {
    if (n == 1) 
        return 0 
    else {
        if(n==2){
            return 1
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}
