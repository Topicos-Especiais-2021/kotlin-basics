fun main() {
//    ifTradicional(1, 2, 3)
//    ifTradicional(2, 1, 3)
//    ifTradicional(1, 1, 1)
//    ifComElsio(1)
//    ifComElsio(-1)
//    ifComElsio(0)
//    expressionIf(1)
//    expressionIf(-1)
//    expressionIf(0)
    println(ifComElsio(1))
    println(blocoIf(1))
    println(blocoIfSingleExpression(1))
}

fun ifTradicional(arg: Int, arg2: Int, arg3: Int) {
    if (arg > arg2 && arg3 > 0) {
        println("$arg é maior que $arg2")
    }
    if (arg < arg2 || arg3 == 0) {
        println("$arg é menor que $arg2")
    }
    if (arg == arg2) {
        println("$arg é igual $arg2")
    }
    if (arg >= arg2) {
        println("$arg é maior ou igual $arg2")
    }
}

fun ifComElsio(arg: Int): String {
    println("ifComElse")
    if (arg > 0) {
        return "$arg é positivo"
    } else if (arg < 0) {
        return "$arg é negativo"
    } else {
        return "O valor é zero"
    }
}

fun blocoIf(arg: Int): String {
    println("blocoIf")
    val resultado = if (arg > 0) {
        "$arg é positivo"
    } else if (arg < 0) {
        "$arg é negativo"
    } else {
        "O valor é zero"
    }
    return resultado
}

fun blocoIfSingleExpression(arg: Int) = if (arg > 0) {
    println("blocoIfSingleExpression")
    "$arg é positivo"
} else if (arg < 0) {
    "$arg é negativo"
} else {
    "O valor é zero"
}

fun expressionIf(arg: Int) {
//    val resultado = arg > 0 ? 1 : 0;
    println(if (arg >= 0) "$arg é positivo" else "$arg é negativo")
}