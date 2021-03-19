package classes

fun main() {
    val pessoa = PessoaKotlin("Kennedy", "11111111111", "000000000", "4455555555")
    pessoa.mudarDDD("66")
    println(pessoa)

    val (nomeCompleto, cpf, rg, telefone) = pessoa

    println(nomeCompleto)
}

class PessoaKotlin(
    private val nomeCompleto: String,
    private val cpf: String,
    private val rg: String,
    private var telefone: String = "",
) {

    fun mudarDDD(dddNovo: String) {
        this.telefone = this.telefone.removeRange(0, 2)
        this.telefone = dddNovo.plus(this.telefone)
    }

    fun trocarRg(rg: String): PessoaKotlin {
        return PessoaKotlin(nomeCompleto, cpf, rg, telefone)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PessoaKotlin

        if (nomeCompleto != other.nomeCompleto) return false
        if (cpf != other.cpf) return false
        if (rg != other.rg) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nomeCompleto.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + rg.hashCode()
        return result
    }

    override fun toString(): String {
        return "Pessoa(nomeCompleto='$nomeCompleto', cpf='$cpf', rg='$rg', telefone='$telefone')"
    }

    operator fun component1(): Any {
        return nomeCompleto
    }

    operator fun component2(): Any {
        return cpf
    }

    operator fun component3(): Any {
        return rg
    }

    operator fun component4(): Any {
        return telefone
    }


}