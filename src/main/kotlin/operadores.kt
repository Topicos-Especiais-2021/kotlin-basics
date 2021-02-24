fun main() {
    soma()
    subtracao()
    multiplicacao()
    divisao()
    comparacao()
    sobra()
    and()
    or()
    not()
}

fun soma() {
    val resultado = 5 + 5
    println("Soma de 5 + 5 = $resultado")
}

fun subtracao() {
    val resultado = 6 - 5
    println("Subtracao de 6 - 5 = $resultado")
}

fun multiplicacao() {
    val resultado = 6 * 5
    println("Multiplicacão de 6 * 5 = $resultado")
}

fun divisao() {
    val resultado = 6 / 3
    println("Divisão de 6 / 3 = $resultado")
}

fun comparacao() {
    val valor1: Int = 1
    val valor2: Int = 2
    val valor3: Int = valor1
    val valor4: Int = 2

    println("Comparacao 1 ${valor1 == valor2}") //false
    println("Comparacao 2 ${valor3 == valor2}") //false
    println("Comparacao 3 ${valor1 == valor3}") //true
    println("Comparacao 4 ${valor2 == valor4}") //true
}

fun sobra() {
    val resultado = 6 % 5
    println("Sobra de 6 / 5 = $resultado")
}

fun and() {
    println("And de true && false: ${true && false}")
    println("And de false && true: ${false && true}")
    println("And de true && true: ${true && true}")
    println("And de false && false: ${false && false}")
}

fun or() {
    println("Or de true || false: ${true || false}")
    println("Or de false || true: ${false || true}")
    println("Or de true || true: ${true || true}")
    println("Or de false || false: ${false || false}")
}

fun not() {
    println("Not de true || false: ${!(true || false)}")
    println("Not de false || true: ${!(false || true)}")
    println("Not de true || true: ${!(true || true)}")
    println("Not de false || false: ${!(false || false)}")
}

