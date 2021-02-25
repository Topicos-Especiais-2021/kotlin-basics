fun main() {
    ifTradicional(1, 2)
    ifTradicional(2, 1)
    ifTradicional(1, 1)
    ifComElse(1)
    ifComElse(-1)
    ifComElse(0)
    expressaoIf(1)
    expressaoIf(-1)
    expressaoIf(0)
    blocoIf(1)
    blocoIf(-1)
    blocoIf(0)
    blocoIfSingleExpressed(1)
    blocoIfSingleExpressed(-1)
    blocoIfSingleExpressed(0)
}

fun ifTradicional(valor1: Int, valor2: Int) {
    if (valor1 > valor2) {
        println("$valor1 é maior que $valor2")
    }

    if (valor1 < valor2) {
        println("$valor1 é menor que $valor2")
    }

    if (valor1 == valor2) {
        println("$valor1 e $valor2 são iguais")
    }

    if (valor1 >= valor2) {
        println("$valor1 é maior ou igual a $valor2")
    }
}

fun ifComElse(arg: Int) {
    if (arg > 0) {
        println("$arg e positivo")
    } else if (arg < 0) {
        println("$arg e negativo")
    } else {
        println("O valor é zero!")
    }
}

fun expressaoIf(arg: Int) {
    val resultado = if (arg >= 0) "$arg é positivo" else "$arg é negativo"
    println("O resultado é: $resultado")
}

fun blocoIf(arg: Int) {
    val resultado = if (arg >= 0) {
        "$arg é positivo"
    } else {
        "$arg é negativo"
    }

    println("O resultado é $resultado")
}

fun blocoIfSingleExpressed(arg: Int): String = if (arg >= 0) {
    "$arg é positivo"
} else {
    "$arg é negativo"
}

