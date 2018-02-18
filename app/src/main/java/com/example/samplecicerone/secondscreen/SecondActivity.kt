package com.example.samplecicerone.secondscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.samplecicerone.R
import com.example.samplecicerone.navigator.Navigator
import com.example.samplecicerone.navigator.Router

/**
 * Created by atabek on 02/13/2018.
 */

class SecondActivity: AppCompatActivity() {
    private lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val navigator = Navigator(supportFragmentManager, R.id.container)
        router = Router(navigator)
        router.navigateTo("")
    }

    fun getRouterr() = router
}