package variaveis

val primeiraVariavel: String = "Primeira Variável"
val segundaVariavel = "Segunda Variável"
var terceiraVariavel: String = "Terceira Variavel"
var quartaVariavel = "Quarta Variavel"

fun main() {
    println(primeiraVariavel)
    println(segundaVariavel)
    println(terceiraVariavel)
    println(quartaVariavel)
    minhaSegundaFuncao()

    val quintaVariavel = "Quinta Variavel"
    println(quintaVariavel)
    println("Valor da variavel $primeiraVariavel") // String Template
}

fun minhaSegundaFuncao() {
    println(primeiraVariavel + " " + segundaVariavel)
}