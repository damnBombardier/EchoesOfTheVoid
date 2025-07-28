@Composable
fun BattleComponent(
    monster: Monster,
    onAttack: () -> Unit,
    onVictory: () -> Unit
) {
    var currentHp by remember { mutableStateOf(monster.hp) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        // Абстрактный монстр
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.Black.copy(alpha = 0.1f))
                .border(2.dp, Color.Black, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "🌀", fontSize = 40.sp)
        }

        Spacer(modifier = Modifier.height(12.dp))

        // HP Bar
        LinearProgressIndicator(
            progress = (currentHp.toFloat() / monster.maxHp).coerceIn(0f, 1f),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(16.dp)
                .clip(RoundedCornerShape(8.dp)),
            color = MaterialTheme.colorScheme.primary
        )

        Text(text = "HP: $currentHp / ${monster.maxHp}")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            currentHp -= 10 // Пример урона
            if (currentHp <= 0) {
                onVictory()
            }
        }) {
            Text("Атаковать")
        }
    }
}