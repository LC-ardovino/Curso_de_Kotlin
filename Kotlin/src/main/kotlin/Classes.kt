class pessoa(
    val nome:String,
    val idade:Int
)

fun main(){
    val pessoa1:pessoa = pessoa("Luiz",21)
    val pessoa2:pessoa= pessoa("Lucas",20)

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")
}