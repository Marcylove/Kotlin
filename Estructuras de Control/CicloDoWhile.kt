/*Ciclo Do while

Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron*/

fun main(){
    var resp:String =""
    var contador =0

    do{
        println("\nIngrse su nombre: ")
        val nombre = readLine()!!
        println("Biendvenido a la clase, senor/senora $nombre")

        contador++
        println("ingrse si, si hay mas personas")
        resp = readLine()!!
    }while(resp== "si")

    println("Llegaron $contador personas!!")
}