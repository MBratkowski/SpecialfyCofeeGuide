package io.bratexsoft.specialtycofeecode.applicaton

import android.app.Application

class SpecialtyCoffeGuideApp : Application() {

    override fun onCreate() {
        super.onCreate()
        SpecialtyCoffeGuideInjector.INSTANCE.app = this
        SpecialtyCoffeGuideInjector.INSTANCE.appComponent.inject(this)
    }
}