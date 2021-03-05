package tipos
import java.math.BigDecimal

fun main() {
    val texto: String = "Primeira Variável"
    val longo: Long = 100L
    val inteiro: Int = 100
    val flutuante: Float = 100.00f
    val decimal: Double = 100.20
    val bytes: Byte = 100
    val curtos: Short = 100
    val booleano: Boolean = true
    val bigDecimal: BigDecimal = BigDecimal.TEN
    var qualquerCoisa: Any = 1

    println(texto)
    println(longo)
    println(inteiro)
    println(flutuante)
    println(decimal)
    println(bytes)
    println(curtos)
    println(booleano)
    println(bigDecimal)
    println(qualquerCoisa)
    qualquerCoisa = "String"
    println(qualquerCoisa)
    qualquerCoisa = 100.00
    println(qualquerCoisa)
}

