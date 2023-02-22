fun main() {
    // Crear el conjunto de frutas y el conjunto de verduras
    val frutas = setOf("manzana", "naranja","papaya", "pera", "banana", "kiwi", "limón", "fresa")
    val verduras = setOf("lechuga", "tomate", "cebolla", "pimiento", "calabacín", "papaya", "patata")

    // Encontrar la intersección entre los conjuntos de frutas y verduras
    val interseccion = frutas.intersect(verduras)

    // Imprimir los elementos de la intersección
    if (interseccion.isEmpty()) {
        println("No hay elementos comunes entre los conjuntos")
    } else {
        println("Los elementos comunes entre los conjuntos son:")
        for (elemento in interseccion) {
            println("- $elemento")
        }
    }
}
