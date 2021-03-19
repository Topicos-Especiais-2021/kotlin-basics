package classes

fun main() {
    val rasso: PessoaProperties = PessoaProperties()
    println(rasso.nomeCompleto)
    rasso.nomeCompleto = "Rafael Rasso"
    rasso.cpf = "valor aleatorio"
    println(rasso.nomeCompleto)
    println(rasso.cpf)

    println(rasso)
}

class PessoaProperties {

    var nomeCompleto: String = "Default"
        set(value) {
            field = value.toUpperCase()
        }

    var cpf: String = "CpfDefault"
        set(value) {
            println("Dentro do set da propertie: $value")
            field = value
        }
        get() {
            println("Dentro do get da propertie: $field")
            return field.capitalize()
        }



}