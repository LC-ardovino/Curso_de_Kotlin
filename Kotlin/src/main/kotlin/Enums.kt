enum class Cor(val vermelho:Int,val verde:Int,val azul:Int){
    Vermelho(255,0,0),
    Laranja(255,165,0),
    Amarelo(255,255,0),
    Verde(0,255,0),
    Azul(0,0,255);

    fun rgb()=((vermelho*256+verde)*256+azul)
}

fun main(){
    val rgb = Cor.Vermelho.rgb()
    println(rgb)
}






