fun main() {
    // Crear la lista de palabras
    val palabras = listOf("manzana", "naranja", "pera", "banana", "kiwi", "limón", "fresa")

    // Contar las palabras según su longitud
    var largoMayor5 = 0
    var largoMenorIgual5 = 0

    for (palabra in palabras) {
        if (palabra.length > 5) {
            largoMayor5++
        } else {
            largoMenorIgual5++
        }
    }

    // Imprimir los resultados
    println("La cantidad de palabras con longitud mayor a 5 es: $largoMayor5")
    println("La cantidad de palabras con longitud menor o igual a 5 es: $largoMenorIgual5")
}
