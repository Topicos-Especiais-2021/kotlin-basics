fun main() {
    funcaoSimples()
    println("Funcao com retorno: ${funcaoComRetorno()}")
    println(funcaoComParametro(0, "Palmeiras não tem mundial"))
    println(funcaoComParametro(segundo = "Dois mundiais com uma libertadores não existe", primeiro = 1))
    println(funcaoComParametroPreDefinido(1))
    singleExpressionFunction("Olá")
    println(singleExpressedComRetorno(1, 2))
    funcaoQualquer()
}

fun funcaoSimples() {
    println("funcao simples")
}

fun funcaoComRetorno(): Int {
    return 1;
}

fun funcaoComParametro(primeiro: Int, segundo: String): String {
    return "Primeiro é $primeiro e o Segundo é $segundo"
}

fun funcaoComParametroPreDefinido(primeiro: Int, segundo: String = "Segundo Padrao"): String {
    return "Primeiro é $primeiro e o Segundo é $segundo"
}

fun singleExpressionFunction(greeting: String) = println(greeting)

fun singleExpressedComRetorno(param1: Int, param2: Int): Int = param1 + param2

fun funcaoQualquer() {
    val minhaVariavel = 10

    fun funcaoLocal(arg: Int): Int {
        return minhaVariavel + arg
    }

    println("Funcao filha ${funcaoLocal(4)}")
}