fun maisDeCincoCaracteres(strings: Array<String>): List <String>{
    return strings.filter { it.length > 5 }
}

fun main(){
    val array = arrayOf("ab", "cdefg", "hi", "jklmno", "pqrstuvwxyz")
    println("Palavras com mais de 5 letras: ${maisDeCincoCaracteres(array)}")
}