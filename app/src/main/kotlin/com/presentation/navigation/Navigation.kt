@Composable
fun SetupNavGraph(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") {
            MainScreen(viewModel = viewModel, navController = navController)
        }
        composable("upgrades") {
            UpgradeScreen(viewModel = viewModel)
        }
        composable("achievements") {
            AchievementScreen()
        }
    }
}