package com.example.android.dagger.registration

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

/**
 * Subcomponents are components that inherit and extend the object graph of a parent component.
 * Thus, all objects provided in the parent component will be provided in the subcomponent too.
 * In this way, an object from a subcomponent can depend on an object provided by the parent component.
 */

// Classes annotated with @ActivityScope will have a unique instance in this Component
@ActivityScope
@Subcomponent
interface RegistrationComponent {

    /**
     * This Component needs to contain registration specific information. For that, we need to:

    Add the inject methods from AppComponent that are specific to Registration, i.e. RegistrationActivity, EnterDetailsFragment, and TermsAndConditionsFragment.
    Create a subcomponent Factory that we can use to create instances of this subcomponent.

     */

    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }
    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)

}