fun main(){
    val numbers = mapOf("yuyu" to 1, "sharis" to 2, "nicol" to 3, "daniel" to 4)

    println("mapas: $numbers")
    println("claves: ${numbers.keys}")
    println("valores: ${numbers.values}")
    
    for(i in numbers){
        println(i)
    }
}