fun main() {
    // Crear el mapa de libros
    val libros = mapOf(
        "libro1" to mapOf(
            "titulo" to "Cien años de soledad",
            "autor" to "Gabriel García Márquez",
            "año" to 1967,
            "editorial" to "Sudamericana"
        ),
        "libro2" to mapOf(
            "titulo" to "El Principito",
            "autor" to "Antoine de Saint-Exupéry",
            "año" to 1943,
            "editorial" to "Reynal & Hitchcock"
        ),
        "libro3" to mapOf(
            "titulo" to "El Aleph",
            "autor" to "Jorge Luis Borges",
            "año" to 1949,
            "editorial" to "Sur"
        )
    )

    // Obtener la información del libro2
    val libro2 = libros["libro2"]

    // Imprimir la información del libro2
    if (libro2 != null) {
        println("Título: ${libro2["titulo"]}")
        println("Autor: ${libro2["autor"]}")
        println("Año: ${libro2["año"]}")
        println("Editorial: ${libro2["editorial"]}")
    } else {
        println("No se encontró el libro")
    }
}
