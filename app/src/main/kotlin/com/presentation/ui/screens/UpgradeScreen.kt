@Composable
fun UpgradeScreen(viewModel: GameViewModel) {
    val player by viewModel.player.collectAsState()
    val upgrades = listOf(
        Upgrade(
            name = "Ядро",
            description = "Увеличивает атаку",
            cost = 100,
            effectType = UpgradeEffectType.ATTACK,
            value = 5.0
        ),
        Upgrade(
            name = "Щиты",
            description = "Увеличивает защиту",
            cost = 150,
            effectType = UpgradeEffectType.DEFENSE,
            value = 3.0
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(upgrades) { upgrade ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(text = upgrade.name, fontWeight = FontWeight.Bold)
                    Text(text = upgrade.description)
                    Text(text = "Цена: ${upgrade.cost} Эха")
                    Button(
                        onClick = { /* TODO: покупка */ },
                        enabled = (player?.echo ?: 0) >= upgrade.cost
                    ) {
                        Text("Улучшить")
                    }
                }
            }
        }
    }
}