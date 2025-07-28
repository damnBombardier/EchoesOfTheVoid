@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providePlayerRepository(
        localDataSource: PlayerLocalDataSource,
        remoteDataSource: PlayerRemoteDataSource
    ): PlayerRepository {
        return PlayerRepositoryImpl(localDataSource, remoteDataSource)
    }
}