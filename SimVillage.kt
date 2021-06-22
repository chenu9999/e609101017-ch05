fun main() {
    runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2018
        println("新建$numBuildings" + "棟房屋")
        "歡迎來到SimVillage，$playerName! (copyright $currentYear)"
    }
}

inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String)
{
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}