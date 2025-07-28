class FirebaseRepository @Inject constructor() {

    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()

    suspend fun savePlayer(player: Player) {
        val userId = auth.currentUser?.uid ?: return
        db.collection("players").document(userId).set(player).await()
    }

    suspend fun loadPlayer(): Player? {
        val userId = auth.currentUser?.uid ?: return null
        val snapshot = db.collection("players").document(userId).get().await()
        return snapshot.toObject(Player::class.java)
    }
}