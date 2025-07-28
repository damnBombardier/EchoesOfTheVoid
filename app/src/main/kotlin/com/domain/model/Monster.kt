data class Monster(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    var hp: Int,
    val maxHp: Int,
    val attack: Int,
    val defense: Int,
    val rewardEcho: Int,
    val rewardExp: Int,
    val rarity: MonsterRarity = MonsterRarity.COMMON
)

enum class MonsterRarity {
    COMMON, RARE, EPIC, LEGENDARY
}