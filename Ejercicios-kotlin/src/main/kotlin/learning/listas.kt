package learning

fun getList() {
    println("Hello, world!!!")
    val newList: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(newList)
    println(newList.first())
    // Get indices (0,1,2,3, etc)
    //    for (item in newList.indices) {
    //        println(item)
    //    }
    // Get item (Lunes, Martes...)
    for (item in newList) {
        println(item)
    }

    // Listas mutables
    println("Listas mutables")
    var mutableList: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(mutableList)
    mutableList.add("Domingo 7")
    println(mutableList)
    val filtrado = mutableList.filter {it == "Lunes"}
    print("FIltrar")
    println(filtrado)

    // Ejercicio 1: Edades
    var edades: MutableList<Int> = mutableListOf(28, 23, 24, 35, 45, 67, 78, 65, 55)
    println("Edades")
    // Agregar edades
    // println("Ingresa tu edad")
    // val edad = readLine()
    // edades.add(edad!!.toInt())
    // println(edades)

    // Methods list
    println(edades.average())
    edades.removeAt(4)
    val counter = edades.count{it >= 50}
    print(counter)
    println("Remover mayores de 50")
    edades.removeAll {it > 50}
    println(edades)
    // Limpiar toda la lista
    edades.clear()
    println(edades)
}