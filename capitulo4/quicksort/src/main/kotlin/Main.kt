fun main() {
    val numeros : IntArray = intArrayOf(2,4,6);
    val resultado = soma(numeros);
    println("O resultado da soma é: $resultado");
}

fun soma(numeros: IntArray) : Int{
    return if(numeros.isEmpty()){
        0;
    } else {
        numeros[0] + soma(numeros.copyOfRange(1, numeros.size));
    }
}