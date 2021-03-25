package heranca

fun main() {
    var pessoa: Pessoa = Pessoa(1, "email1@email.com", "endereco da pessoa")
    var pessoaFisica: Pessoa = PessoaFisica(2,
        "email2.email.com",
        "endereco da pessoa fisica",
        "0000000000",
        "Nome pessoa fisica",
        "4444444444")

    pessoa.funcaoNoPai() // funcaoNoPai endereco da pessoa
    pessoa.funcaoNoPaiQuePodeSerSobreescrita() // funcaoNoPaiQuePodeSerSobreescrita
    pessoaFisica.funcaoNoPai() // funcaoNoPai endereco da pessoa fisica
    pessoaFisica.funcaoNoPaiQuePodeSerSobreescrita() // funcaoNoPaiQuePodeSerSobreescrita endereco da pessoa fisica
}

open class Pessoa(
    private val id: Long,
    private var email: String = "default@email.com",
    endereco: String,
) {

    protected open val endereco: String = endereco

    fun funcaoNoPai() {
        println("funcaoNoPai $endereco")
    }

    open fun funcaoNoPaiQuePodeSerSobreescrita() {
        println("funcaoNoPaiQuePodeSerSobreescrita")
    }

}

class PessoaFisica(
    id: Long,
    email: String,
    endereco: String,
    private val cpf: String,
    private var nome: String,
    private var rg: String,
) : Pessoa(id, email, endereco) {

    override val endereco = endereco
        get() {
            return field.toUpperCase()
        }

    override open fun funcaoNoPaiQuePodeSerSobreescrita() {
        println("funcaoNoPaiQuePodeSerSobreescrita $endereco")
    }


}

class PessoaJuridica(
    id: Long,
    email: String,
    endereco: String,
    private val nomeFantasia: String,
    private val cnpj: String = "default",
) : Pessoa(id, email, endereco) {

    override val endereco = "outro juridica"

    override fun funcaoNoPaiQuePodeSerSobreescrita() {
        println("Pessoa Juridica")
    }

}