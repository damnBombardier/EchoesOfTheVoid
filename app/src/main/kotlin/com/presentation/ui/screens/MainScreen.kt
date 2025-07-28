@Composable
fun MainScreen(
    viewModel: GameViewModel,
    navController: NavController
) {
    val player by viewModel.player.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Эхо: ${player?.echo ?: 0}",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = "Уровень: ${player?.level ?: 1}")

        Spacer(modifier = Modifier.height(24.dp))

        // Монстр
        BattleComponent(
            monster = Monster(
                name = "Грань",
                hp = 100,
                maxHp = 100,
                attack = 15,
                defense = 5,
                rewardEcho = 50,
                rewardExp = 30
            ),
            onAttack = { /* TODO */ },
            onVictory = { /* TODO */ }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { navController.navigate("upgrades") }) {
                Text("Прокачка")
            }
            Button(onClick = { navController.navigate("achievements") }) {
                Text("Достижения")
            }
        }
    }
}