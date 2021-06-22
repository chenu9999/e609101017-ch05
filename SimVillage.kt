fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("新建$numBuildings" + "棟房屋")
        "歡迎來到SimVillage，$playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal", 2))
}