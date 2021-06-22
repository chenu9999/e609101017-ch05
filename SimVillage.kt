fun main() {
    val greetingFunction: (String) -> String = {
        val currentYear = 2018
        "歡迎來到SimVillage，$it! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal"))
}