package ltd.kaizo.realestatemanager.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lltd/kaizo/realestatemanager/injection/Injection;", "", "()V", "provideEstateDataSource", "Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "context", "Landroid/content/Context;", "provideExecutor", "Ljava/util/concurrent/Executor;", "provideViewModelFactory", "Lltd/kaizo/realestatemanager/injection/ViewModelFactory;", "app_debug"})
public final class Injection {
    public static final ltd.kaizo.realestatemanager.injection.Injection INSTANCE = null;
    
    private final ltd.kaizo.realestatemanager.repositories.EstateRepository provideEstateDataSource(android.content.Context context) {
        return null;
    }
    
    private final java.util.concurrent.Executor provideExecutor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.injection.ViewModelFactory provideViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private Injection() {
        super();
    }
}