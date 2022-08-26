fun obterMnemonica(cor:Cor) =
    when(cor) {
        Cor.Vermelho -> "Ver"
        Cor.Amarelo -> "Alguem"
        Cor.Verde -> "Viver"
        Cor.Azul -> "Alem e"
        Cor.Laranja -> "Legal"
    }

fun obterTemperatura(cor: Cor): String{
    return when(cor){
        Cor.Vermelho, Cor.Laranja, Cor.Amarelo -> "Quente"
        Cor.Verde -> "Neutro"
        Cor.Azul -> "Frio"
    }
}

fun main(){
    val mnemonica = obterMnemonica(Cor.Vermelho)
    println(mnemonica)

    val temperatura = obterTemperatura(Cor.Azul)
    println(temperatura)
}








