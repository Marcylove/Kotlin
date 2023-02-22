fun main(){
// Mapa inmutable
val mapaA = mapOf("uno" to 1, "dos" to 2, "tres" to 3)

// Mapa mutable
val mapaB = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)

//Acceder a los elementos de un mapa
mapaA["uno"]

//Modificar un elemento de un mapa se puede mediante put 
mapaA.put("dos",8)
mapaB.remove("dos")

//Recorrer un mapa se hace mediante un for

for(i in mapaA){
    println(i)
}
}