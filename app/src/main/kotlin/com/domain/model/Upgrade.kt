data class Upgrade(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val description: String,
    val cost: Int,
    val effectType: UpgradeEffectType,
    val value: Double,
    var level: Int = 0
)

enum class UpgradeEffectType {
    ATTACK, DEFENSE, AUTO_ECHO, EXP_BOOST, CRIT_CHANCE
}