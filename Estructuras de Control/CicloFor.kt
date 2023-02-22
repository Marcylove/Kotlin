/*Ciclo For
Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:
    -Cantidad de estudiantes procesados
    -Promedio total de los promedios*/

    fun main(){

        var cantEstudiantes:Int
        var sumaPromedios =0.0

        println("Ingrse la cantidad de estudiantes: ")
        cantEstudiantes = readLine()!!.toInt()

        for(i in 1..cantEstudiantes){
            println("Ingrese el promedio del estudiante $i: ")

            var promedio=readLine()!!.toDouble()
            sumaPromedios+=promedio
        }
        var promedioTotal =sumaPromedios/cantEstudiantes
        println("Cantidad de estudiantes procesasdos es: $cantEstudiantes")
        println("El promedio total dfe los promedios es: $promedioTotal")

    }