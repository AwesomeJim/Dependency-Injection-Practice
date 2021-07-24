package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
*An interface annotated with @Component will make Dagger generate code with all the dependencies required
* to satisfy the parameters of the methods it exposes. Inside that interface, we can tell Dagger that RegistrationActivity requests injection.
*
* A @Component interface gives the information Dagger needs to generate the graph at compile-time. The parameter of the interface methods define what classes request injection.
 * If we annotate a Component with @Singleton, all the classes also annotated with @Singleton will be scoped to its lifetime
 */
// Definition of a Dagger component that adds info from the StorageModule to the graph
@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        /**
         * @BindsInstance tells Dagger that it needs to add that instance in the graph and whenever Context is required, provide that instance.
         * Use @BindsInstance for objects that are constructed outside of the graph (e.g. instances of Context).
         *
         *  With @BindsInstance, the Context passed in will be available in the graph
         *
         * @param context Context
         * @return AppComponent
         */

        fun create(@BindsInstance context: Context): AppComponent
    }

    /**
     * There are two different ways to interact with the Dagger graph:

    Declaring a function that returns Unit and takes a class as a parameter allows field injection in that class (e.g. fun inject(activity: MainActivity)).
    Declaring a function that returns a type allows retrieving types from the graph (e.g. fun registrationComponent(): RegistrationComponent.Factory).


     * @return RegistrationComponent.Factory
     */
    // Classes that can be injected by this Component
   // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)


}