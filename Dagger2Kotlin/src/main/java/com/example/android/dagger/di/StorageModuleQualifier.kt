package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RegistrationStorage

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LoginStorage

@Module
class StorageModuleQualifier {
    /**
     * You can achieve the same functionality as qualifiers with the @Named annotation, however qualifiers are recommended because:

    They can be stripped out from Proguard or R8
    You don't need to keep a shared constant for matching the names
    They can be documented

     * @param context Context
     * @return Storage

    @RegistrationStorage
    @Provides
    fun provideRegistrationStorage(context: Context): Storage {
        return SharedPreferencesStorage("registration", context)
    }

    @LoginStorage
    @Provides
    fun provideLoginStorage(context: Context): Storage {
        return SharedPreferencesStorage("login", context)
    }
    */
    //TODO: There's one more part of the codelab app for you to experiment with - adding a splash screen.
// MainActivity.kt currently decides which screen to show based on whether the user is registered or logged in..
// That's problematic because we're doing conditional dependency injection, only injecting when the user is logged in and will remain on the MainActivity.
    //
    // These steps don't contain comments or code, so try it on your own:
    //
    //     Create a SplashActivity with a SplashViewModel that decides which screen to display..
    //     As we've been doing, use dependency injection in SplashActivity to get fields injected by Dagger.
    //     Remove the logic in the onCreate method of the MainActivity.kt since when the Activity is opened, the user will be logged in.
}
