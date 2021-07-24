package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
* Similar to Components, Dagger Modules tell Dagger how to provide instances of a certain type.
 * Dependencies are defined using the @Provides and @Binds annotations.
 *
 * Tells Dagger this is a Dagger module
 * Because of @Binds, StorageModule needs to be an abstract class
 */
@Module
abstract class StorageModule {

    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}