package learning

fun runMaps() {
    println("---------MAPS----------")
    val prefijos: Map<Int, String> = mapOf(34 to "Spain", 1 to "USA", 52 to "México")

    for ((key, value) in prefijos) {
        println("$key es el codigo del pais de $value")
    }
    println(prefijos.get(52))
    println(prefijos[1])
    val monedas: MutableMap<String, String> =
        mutableMapOf("euro" to "Spain", "Dolar" to "USA", "Libra" to "UK", "Peso" to "México")
    println("Paises ${monedas.values}")
    println("Paises ${monedas.keys}")
    monedas.put("cedi", "Ghana")
    println("Paises ${monedas.values}")
    println("Paises ${monedas.keys}")
    monedas.remove("cedi")
    println("Paises ${monedas.values}")
    println("Paises ${monedas.keys}")
}