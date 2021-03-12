package loops

fun main() {
    forMap()
}

fun forMap() {
    val times = mapOf(Pair(1, "Parmera"), Pair(2, "Curintia"), Pair(3, "Gremio"))
    for (time in times) {
        println("O item com chave ${time.key} tem o valor ${time.value}")
    }
}

private fun loopComTuplas() {
    val times = mutableListOf("Parmera", "Curintia", "Gremio")
    println(times[2])

    for ((index, value) in times.withIndex()) {
        println("No indice $index está o time ${value}")
    }
}

fun loopForIndices() {
    val times = mutableListOf("Parmera", "Curintia", "Gremio")
    println(times[2])

    for (index in times.indices) {
        println("No indice $index está o time ${times[index]}")
    }
}

fun loopInverso() {
    println("Lancando foguete em..")
    for (contador in 10 downTo 1 step 2) {
        println(contador)
    }
    println("Lancar")
}

fun loopStep() {
    for (contador in 1..10 step 2) {
        println("Contador pulando de 2 em 2: $contador")
    }
}

fun loopRange() {
    for (contador in 1..10) {
        println("O contador atual é $contador")
    }
}