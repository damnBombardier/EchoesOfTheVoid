data class Player(
    val id: String = UUID.randomUUID().toString(),
    var name: String = "Echo",
    var level: Int = 1,
    var exp: Int = 0,
    var expToNextLevel: Int = 100,
    var echo: Int = 0, // валюта
    var attack: Int = 10,
    var defense: Int = 5,
    var critChance: Double = 0.05,
    var autoEchoPerSecond: Int = 1,
    var lastOnline: Long = System.currentTimeMillis()
)