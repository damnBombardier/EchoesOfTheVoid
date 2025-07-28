@HiltViewModel
class GameViewModel @Inject constructor(
    private val getPlayerUseCase: GetPlayerUseCase,
    private val savePlayerUseCase: SavePlayerUseCase
) : ViewModel() {

    private val _player = mutableStateOf<Player?>(null)
    val player: State<Player?> = _player

    init {
        loadPlayer()
    }

    private fun loadPlayer() {
        viewModelScope.launch {
            _player.value = getPlayerUseCase()
        }
    }

    fun attackMonster() {
        // Логика атаки
    }

    fun saveProgress() {
        viewModelScope.launch {
            _player.value?.let { savePlayerUseCase(it) }
        }
    }
}