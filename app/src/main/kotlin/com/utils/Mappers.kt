fun PlayerEntity.toDomainModel(): Player {
    return Player(
        id = id,
        name = name,
        level = level,
        exp = exp,
        echo = echo,
        attack = attack,
        defense = defense,
        critChance = critChance,
        autoEchoPerSecond = autoEchoPerSecond,
        lastOnline = lastOnline
    )
}

fun Player.toEntity(): PlayerEntity {
    return PlayerEntity(
        id = id,
        name = name,
        level = level,
        exp = exp,
        echo = echo,
        attack = attack,
        defense = defense,
        critChance = critChance,
        autoEchoPerSecond = autoEchoPerSecond,
        lastOnline = lastOnline
    )
}