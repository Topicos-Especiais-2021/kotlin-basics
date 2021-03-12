package loops

fun main() {
    loopQualificado()
}

fun loopNormal() {
    for (i in 1..10) {
        print("First $i: ")
        for (x in 1..5) {
            print(x)
        }
        println()
    }
}

fun loopComBreakNoPrimeiroLoop() {
    for (i in 1..10) {
        print("First $i: ")
        for (x in 1..5) {
            print(x)
        }
        println()
        break;
    }
}

fun loopComBrearNoSegundoLoop() {
    for (i in 1..10) {
        print("First $i: ")
        for (x in 1..5) {
            print(x)
            break;
        }
        println()
    }
}

fun loopQualificado() {
    first@ for (i in 1..10) {
        print("First $i: ")
        second@ for (x in 1..5) {
            print(x)
        }
        println()
    }
}