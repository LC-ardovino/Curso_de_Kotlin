//(1+2) +4

interface Expressao

class Numero(val valor: Int) : Expressao
class Soma(val esquerdo:Int,val direito:Int): Expressao

fun avaliacao(expressao: Expressao): Int {
    if(expressao is Numero){
        return expressao.valor
    }
    if (expressao is Soma){
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }
}



