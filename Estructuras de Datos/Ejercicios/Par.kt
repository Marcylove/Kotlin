fun main() {
    // Crear la lista de pares de personas
    val personas = listOf(
        Pair("Juan", 30),
        Pair("Pedro", 25),
        Pair("María", 35),
        Pair("Luis", 27)
    )

    // Ordenar la lista de pares de personas por edad
    val personasOrdenadas = personas.sortedBy { it.second }

    // Imprimir la lista de pares de personas ordenada
    personasOrdenadas.forEach { persona ->
        println("${persona.first} - ${persona.second}")
    }
}
