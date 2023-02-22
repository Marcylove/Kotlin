fun main() {
    // Crear el arreglo de números
    val numeros = arrayOf(10, 4, 6, 8, 2, 5, 1, 9, 7, 3)

    // Calcular la suma de los números pares y la cantidad de números impares
    var sumaPares = 0
    var cantidadImpares = 0

    for (numero in numeros) {
        if (numero % 2 == 0) {
            sumaPares += numero
        } else {
            cantidadImpares++
        }
    }

    // Imprimir los resultados
    println("La suma de los números pares es: $sumaPares")
    println("La cantidad de números impares es: $cantidadImpares")
}
