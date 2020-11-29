

open class personas{
    open fun recorrer()
    {
        println("Soy una persona")
    }
}
class César:personas(){
    override fun recorrer(){
        println("Soy Elder")
    }
}
class Steven:personas(){
    override fun recorrer(){
        println("Soy Josefina")
    }
}
class Eren:personas(){
    override fun recorrer(){
        println("Heyling")
    }
}
fun main(){
    var lista_personas= ArrayList<personas>()
    var Elder= Elder()
    var Josefina= Josefina()
    var Heyling= Heyling()
    lista_personas.add(Elder)
    lista_personas.add(Josefina)
    lista_personas.add(Heyling)
    for(per in lista_personas)
    {
            per.recorrer()
    }

}
