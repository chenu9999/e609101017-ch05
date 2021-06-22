fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("新建$numBuildings" + "棟房屋")
        "歡迎來到SimVillage，$playerName! (copyright $currentYear)"
    }
    runSimulation("Guyal", greetingFunction)
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String)
{
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}