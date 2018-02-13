package com.example.samplecicerone

import android.app.Application
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * Created by atabek on 02/13/2018.
 */

class CiceroneApplication: Application() {
    private lateinit var cicerone: Cicerone<Router>

    override fun onCreate() {
        super.onCreate()
        cicerone = Cicerone.create()
    }

    fun getNavigationHolder() = cicerone.navigatorHolder

    fun getRouter() = cicerone.router
}