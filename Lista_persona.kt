open class personas{
    open fun recorrer()
    {
        println("Soy una persona")
    }
}
class Excy:personas(){
    override fun recorrer(){
        println("soy Excy")
    }
}
class Doribel:personas(){
    override fun recorrer(){
        println("Soy Doribel")
    }
}
class José:personas(){
    override fun recorrer(){
        println("Soy José")
    }
}
fun main(){
    var lista_personas= ArrayList<personas>()
    var Excy= Excy()
    var Doribel= Doribel()
    var José= José()
    lista_personas.add(Excy)
    lista_personas.add(Doribel)
    lista_personas.add(José)
    for(per in lista_personas)
    {
            per.recorrer()
    }

}

//Este es el resultado que da, tuve que declarar todas las variables necesarias, use var porque este se puede renombrar lo que uno quera,
// para que mediera el resultado.
