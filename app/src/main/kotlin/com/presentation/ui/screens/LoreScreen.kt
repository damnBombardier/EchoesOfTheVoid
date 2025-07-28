@Composable
fun AchievementScreen() {
    val achievements = listOf(
        Achievement(
            id = "first_blood",
            title = "Первая кровь",
            description = "Победите первого монстра",
            icon = "⚔️",
            isUnlocked = true
        ),
        Achievement(
            id = "collector",
            title = "Собиратель",
            description = "Соберите 1000 Эха",
            icon = "💰",
            isUnlocked = false
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(achievements) { achievement ->
            AchievementItem(achievement)
        }
    }
}

@Composable
fun AchievementItem(achievement: Achievement) {
    val color = if (achievement.isUnlocked) Color.Black else Color.Gray

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = achievement.icon, fontSize = 24.sp, color = color)
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = achievement.title,
                    fontWeight = FontWeight.Bold,
                    color = color
                )
                Text(text = achievement.description, color = color)
            }
        }
    }
}