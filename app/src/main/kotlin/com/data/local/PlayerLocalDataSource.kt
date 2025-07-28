@Singleton
class PlayerLocalDataSource @Inject constructor(
    private val dao: PlayerDao
) {
    suspend fun getPlayer(): Player? {
        return dao.getPlayer()?.toDomainModel()
    }

    suspend fun savePlayer(player: Player) {
        dao.insertPlayer(player.toEntity())
    }
}