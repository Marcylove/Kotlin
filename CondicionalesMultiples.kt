/*Condicionales Anidados

De un operario se conoce su sueldo y los años de antigüedad. Se pide crear un programa que lea los datos de entrada
e informe:
    -Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20%, mostrar el sueldo
    a pagar.
    -Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%.
    -Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios*/

    fun main(){
        var aumento:Float =0f
        var antiguedad:Int = 0
        var sueldo:Float = 0f

    println("ingrese su sueldo: ")
    sueldo = readLine()!!.toFloat()
    
    println("Ingrse su antiguedad")
    antiguedad = readLine()!!.toInt()

    if(sueldo < 500 && antiguedad>= 10){
        aumento = (sueldo * 0.2).toFloat()
        sueldo  += aumento
        println("Usted tienes un aumento del 20%, su sueldo nuevo es: $sueldo")
    }else if(sueldo < 500 && antiguedad < 10){
        aumento = (sueldo * 0.05).toFloat()
        sueldo += aumento
        println("Usted tiene un aumento del 5%, su sueldo nuevo es: $sueldo")
    }else{
        println("Usted no tiene ningun aumento, su sueldo es: $sueldo")
    }
    

    }