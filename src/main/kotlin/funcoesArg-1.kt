fun main() {
    val resultado = somar(1, 2, 3, 4)
println(resultado)

val resultado2 = somar(10, 20)
println(resultado2)

val resultado3 = somar(5)
println(resultado3)
}

fun somar(vararg numeros: Int): Int {
    return numeros.sum()
}
