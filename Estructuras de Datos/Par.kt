fun main(){
//Para crear pares en kotlin se usa la palabra Pair y se le ponen los dos valores o la palabra reservada to
var pair = Pair("Hola","Chao")

var pair2 = "Hola" to "Chao"

//se puede descomponer en dos variables asignandoles nombres entre parentesis
var(usuario, identificacion) = Pair ("Pedro", 1012)

//Acceder a un elemento par se debe usar first para acceder al primer elemento y second para acceder al segundo elemento
println(pair.first)
println(pair.second)

//Modificar elementos par deben estar descompuestos en distintas variables y solo llamar a la variable y asignarle un nuevo valor
usuario="Samuel"
println(usuario+identificacion)

//Recorrer un par se realiza con un forEach, poniendo como los parametros el primer y segundo elemento y al final imprimirlos
pair.forEach{(first, second) -> 
println("$first $second")}
}