/*Condicional Simple

La tienda "Mis Zapatos" esta de aniversario, por esa razon se esta realizando un descuento del 50% en compras mayores o iguales a los  $100.000
Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente, en caso de que el descuento sea valido se debe informaral usuario el valor descontado*/

fun main(){
    println("Ingrese el valor de la compra: ")
    var valorCompra = readLine()!!.toDouble()

    println("El valor de la compra: $valorCompra")

    var descuento = 0.0

    if(valorCompra >= 100000){
        descuento = valorCompra * 0.5
        valorCompra -= descuento
        println("Se aplico un decuento del 50% equivalente a: $descuento")
    }

    println("El valor final: $valorCompra")

}

