package exercises

import kotlin.random.Random

fun runLists(){
    val randoms = MutableList(20) { 0 }
    val maxNumber: Int = 6
    for (index in randoms.indices){
        randoms[index] = Random.nextInt(1, maxNumber + 1)
    }
    val counter = randoms.count{it == 1}
    println(randoms)
    print("How many one exist?: $counter")
    randoms.removeAll { it == 6 }
    println("Removed 6")
    println(randoms)
}