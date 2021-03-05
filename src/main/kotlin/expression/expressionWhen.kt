package expression

fun main() {
    println("Digite um número?")
    val input: Int? = readLine()?.toInt()
    whenRange(input)
}

fun whenRange(input: Int?) {
    when (input) {
        in 11..20 -> println("$input está entre 11 e 20")
        !in 1..10 -> println("$input não está entre 1 e 10")
        else -> println("Nehuma das anteriores")
    }
}

fun whenAlternativo(input: Int?, input2: Int?) {
    when {
        input!! > 0 -> println("é positivo")
        input2!! > 0 -> println("é positivo")
        else -> println("Ninguem é positivo")
    }
}


fun whenSingleExpressed(input: Int?) = when (input) {
    0 -> println("é zero")
    1, 2 -> println("está entre 1 e 2")
    else -> println("Nenhuma das anteriores")
}

fun whenSimplificado(input: Int?) {
    when (input) {
        0 -> println("é zero")
        1, 2 -> println("está entre 1 e 2")
        else -> println("Nenhuma das anteriores")
    }
}

fun whenVerboso(input: Int?) {
    when (input) {
        // arrow function
        0 -> {
            println("é zero")
        }
        1, 2 -> {
            println("está entre 1 e 2")
        }
        else -> {
            println("Nenhuma das anteriores")
        }
    }
}