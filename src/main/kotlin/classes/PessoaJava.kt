package classes


// Classe Kotlin escrita com mindset de Beans Java

fun main() {
    val generali: PessoaJava = PessoaJava("Fernando", "111.111.111-00", "11111111")
    val rafael: PessoaJava = PessoaJava("Rafael", "4444444444")

    println("Pessoa: $generali")
    println("Pessoa: $rafael")
}


class PessoaJava constructor(
    nomeCompleto: String = "NomeDefault",
    cpf: String = "CpfDefault",
    rg: String = "RgDefault",
) {

    private var nomeCompleto = nomeCompleto
    private var cpf = cpf
    private var rg = rg
    private var telefone = ""

    constructor(nomeCompleto: String, telefone: String) : this(nomeCompleto, "CpfDefault2", "RgDefault2") {
        this.telefone = telefone
    }

    fun getNomeCompleto(): String {
        return this.nomeCompleto
    }

    fun setNomeCompleto(nomeCompleto: String) {
        this.nomeCompleto = nomeCompleto
    }

    fun getCpf(): String = this.cpf

    fun setCpf(cpf: String) {
        this.cpf = cpf
    }

    fun getRg(): String {
        return this.rg
    }

    fun setRg(rg: String) {
        this.rg = rg
    }



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PessoaJava

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


}