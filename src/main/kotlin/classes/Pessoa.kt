package classes

fun main() {
    val generali = Pessoa()
    val (b1, b2, b3, b4) = generali

    println(b1)
    println(b2)
    println(b3)
    println(b4)

}

data class Pessoa(
    val nomeCompleto: String = "Default",
    val cpf: String = "CpfDefaul",
    val rg: String = "RgDefault",
) {

    var endereco: String = "endereco"

    operator fun component4(): Any {
        return endereco
    }

}
