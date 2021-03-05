package funcoes

fun main() {
    val resultado = argumentoComValorDefault(
        arg2 = "Frita",
        arg = "Batata"
    )
    println(resultado)
}

fun argumentoComValorDefault(
    arg: String = "Valor default 1",
    arg2: String,
): String {
    return "Arg: $arg & Arg2: ${arg2}"
}

fun funcaoSimples() {
    println("Aleatorio")
}

fun funcaoComRetorno(): Int {
    return 1;
}

fun funcaoComParametros(arg: String, arg2: String): String {
    return "Retorno aleatorio"
}

fun singleExpressionRetorno(greeting: String) = println(greeting)

fun singleExpressionComRetorno(arg: Int, arg2: Int): Int = arg + arg2

fun funcaoOriginal() {
    val nome: String = "Facec"

    fun funcaoLocal() {
        println("Funcao Local: $nome")
    }

    funcaoLocal()
}

