package loops

fun main() {
}

fun loopComContinue() {
    var contador = 10
    println("Iniciando contagem regressiva...")
    while (contador >= 0) {
        if (contador % 2 == 0) {
            contador--
            continue
        }
        println(contador)
        contador--
    }
    println("Zarparrr!!!")
}

fun loopComBreak() {
    var contador = 9
    println("Iniciando contagem regressiva...")
    while (contador >= 0) {
        if (contador % 2 == 0) {
            break
        }
        println(contador)
        contador--
    }
    println("Zarparrr!!!")
}

fun loopWhile() {
    var contador = 10
    println("Iniciando contagem regressiva...")
    do {
        println(contador)
        contador--
    } while (contador >= 0)
    println("Zarparrr!!!")
}

fun whileTradicional() {
    var contador = 10
    println("Iniciando contagem regressiva...")
    while (contador >= 0) {
        println(contador)
        contador--
    }
    println("Zarparrr!!!")
}