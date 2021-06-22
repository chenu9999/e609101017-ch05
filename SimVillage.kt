fun main() {
    val numLetters = "Mississippi".count({ letter ->
        letter == 's'
    })
    println(numLetters)
}