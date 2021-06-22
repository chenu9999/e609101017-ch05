fun main() {
    runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2018
        println("新建$numBuildings" + "棟房屋")
        "歡迎來到SimVillage，$playerName! (copyright $currentYear)"
    }
    /* 呼叫runSimulation("Guyal", greetingFunction) 將val greetingFunction的內容{ playerName: String, numBuildings: Int ->}
    直接放入runSimulation中為參數 再將()往前移 只放入fun以外的String參數
    參考課本5-9*/
}

inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String)
{
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}