fun main(){
// Conjunto inmutable de números enteros
val conjuntoA = setOf(1, 2, 3, 4, 5)

// Conjunto mutable de números enteros
val conjuntoB = mutableSetOf(1, 2, 3, 4, 5)

//acceder a un elemento de conjunto
println(conjuntoA[0])
println(conjuntoB.get(3))

//Modificar elementos de conjunto
conjuntoA.set(0,5)
conjuntoB[1]=9

//Recorrer los elementos de un conjunto

for(i in conjuntoA){
    println(i)
}
}