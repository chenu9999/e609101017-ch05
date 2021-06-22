fun main() {
    val greetingFunction: () -> String = {
        val currentYear = 2018
        "歡迎來到SimVillage，Mayer! (copyright $currentYear)"
    }
    println(greetingFunction())
}