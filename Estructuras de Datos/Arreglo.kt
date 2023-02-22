fun main(){
//Se declara el arreglo, se le asigna un identificador, despues el "=", la funcion arrayof para colocar entre parentesis los elementos que contendra el arreglo. Una manera de crear un arreglo es la sgte, que se puede usar tanto con numero enteros como con cadenas de texto

val numeros = arrayOf(5, 2, 4, 1, 3)

//Otra forma es con la palabra Array, y dentro de los parentesis colocando el tamaño que va a tener y una funcion con los indices que va a almacenar. Abajo se pueden agregar los elementos que contendra uno por uno

val frutas = Array(4, { i -> "" })
    frutas[0]="Manzana"
    frutas[1]="Pera"
    frutas[2]="Banano"
    frutas[3]="Sandia"

//Modificar un elemento primero se debe obtener y se le asigna el nuevo valor

numeros[0]=8
numeros[1]=10

println(numeros[0])
println(numeros[1])

//otra forma de modificar un elemento de un arreglo es con la funcion set poniendo la posicion del indice y lo que se va a poner en esa posicion

numeros.set(1,5)
println(numeros[1])

//Recorrer un arreglo se hace con el ciclo for, que toma un contador que va aumentando en cada posicion del arreglo y luego lo imprime

for(i in numeros){
    println(i)
}

//Acceder a un elemento especifico del arreglo se usan los corchetes [] con el indice del elemento al que deseamos acceder

val tercerNumero = numeros[2]

println(tercerNumero)
}
