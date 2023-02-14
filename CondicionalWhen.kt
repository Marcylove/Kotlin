/*Condicional multiple con When

Haga un algoritmo que solicite el numero de horas trabajadas de un empleado, teniendo que el valor de la hora es igual a $2000 calcule el salario base y realicele un descuento del 10% por concepto de derechos medicos, posteriormente solicite el tipo de empleado y realice el aumento del salario basado en la siguiente tabla: 
    Tipo A - Aumento del 30%
    Tipo B - Aumento del 20%
    Tipo C - Aumento del 10%
    En caso de que el usuario no tenga un tipo definido, entonces no se le realizará ningún aumento, indique cual seria el salario final basado en los calculos anteriores*/
fun main(){
    println("Ingrese el nuemro de horas trabajadas: ")
    val horasTrabajadas = readLine()!!.toInt()
    val tarifaHora = 2000
    var salario = horasTrabajadas * tarifaHora
    println("El salario base es: $salario")
    var medico = 0.1
    var descuento = salario*medico
    println("El descuento es que se realiza sobre derechos medicos es del 10% equivalente a $descuento")
    var salarioTotal=salario-(descuento)
    println("Salario neto a pagar aplicando el descuentoes de $salarioTotal")
    print("Ingrse el tipo de emplado (A, B, C): ")
    val tipoemplado= readLine()!!
    var porcAumento=0.0

    when(tipoemplado){
        "a","A"->{
            porcAumento=30.0
            println("Es tipo A")
        }
        "b","B"->{
            porcAumento=20.0
            println("Es tipo B")
        }
        "c","C"->{
            porcAumento=10.0
            println("Es tipo C")
        }
        else -> {
            println("No se realizara un aumento")
            porcAumento= 0.0
        }
    }
    if(porcAumento!=0.0){
        var aumento = salarioTotal*(porcAumento/100)
        salarioTotal=salarioTotal+aumento
        println("Se realizo un aumento de $aumento equivalente a $porcAumento" )
        println("El salario final quedo en $salarioTotal")
    }
}