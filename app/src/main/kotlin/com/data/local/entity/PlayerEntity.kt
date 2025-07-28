@Entity(tableName = "players")
data class PlayerEntity(
    @PrimaryKey val id: String,
    val name: String,
    val level: Int,
    val exp: Int,
    val echo: Int,
    val attack: Int,
    val defense: Int,
    val critChance: Double,
    val autoEchoPerSecond: Int,
    val lastOnline: Long
)