fun main() {
    val greetingFunction: (String) -> String = { playerName ->
        val currentYear = 2018
        "歡迎來到SimVillage，$playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal"))
}