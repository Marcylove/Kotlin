fun main(){
// Crear una lista inmutable de cadenas. No se puede modificar
val listaDeCadenas = listOf("Manzana", "Naranja", "Plátano")

// Crear una lista mutable de números. Si se puede modificar
val listaDeNumeros = mutableListOf(1, 2, 3, 4, 5)

//Para acceder a un elemento de la lista es con corchetes [] y con el metodo get y el numero del indice
println(listaDeNumeros[0])
println(listaDeNumeros.get(4))

//Modificar un elemento de la lista, se pone el nombre de la lista con corchetes [] y la posicion que se va cambiar 
listaDeNumeros.set(1,7)
listaDeNumeros[0]=12

//Recorrer un lista se hace con el ciclo for, que toma un contador que va aumentando en cada posicion del lista y luego lo imprime

for(i in listaDeNumeros){
    println(i)
}
println(listaDeNumeros)
}