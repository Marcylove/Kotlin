/*Ciclo While

Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron*/

fun main(){
    var resp:String = "si"
    var contador = 0

    while(resp=="si"){

        println("\nIngrerse su nombre: ")
        val nombre = readLine()!!

        println("Hola $nombre, bienvenido a la clase\n")

        contador++
        println("Ingrese si, si hay mas personas")
        resp = readLine()!!
    }
    println("Llegaron $contador personas!!")
}