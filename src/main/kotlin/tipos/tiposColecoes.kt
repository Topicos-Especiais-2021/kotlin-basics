package tipos

import java.math.BigDecimal

fun main() {
    val colecaobigDecimal: ArrayList<BigDecimal> = arrayListOf(BigDecimal.TEN)

    val colecaotexto: List<String> = listOf("Primeira variavel")
    val colecaotextomutavel: MutableList<String> = mutableListOf("Primeira variavel")

    val mapaDeTexto: Map<String, String> = mapOf(Pair("chave", "valor"), Pair("chave2", "valor2"))
    val mapaDeTextoMutavel: MutableMap<String, String> = mutableMapOf()

    val colecaolongo: LongArray = longArrayOf(1L, 2L, 3L)
    val colecaointeiro: IntArray = intArrayOf(1, 2, 3)
    val colecaoflutuante: FloatArray = floatArrayOf(100f, 110f)
    val colecaodecimal: DoubleArray = doubleArrayOf(1.00, 2.00)
    val colecaobytes: ByteArray = byteArrayOf(1, 3)
    val colecaocurtos: ShortArray = shortArrayOf(1, 4)
    val colecaobooleano: BooleanArray = booleanArrayOf(true, false, true)

    colecaotextomutavel.add("Segunda Variavel")
    println(colecaolongo)
}