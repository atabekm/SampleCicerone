package com.example.samplecicerone.secondscreen

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.samplecicerone.CiceroneApplication
import com.example.samplecicerone.R
import com.example.samplecicerone.Screens
import com.example.samplecicerone.secondscreen.fragment.FragmentA
import com.example.samplecicerone.secondscreen.fragment.FragmentB
import com.example.samplecicerone.secondscreen.fragment.FragmentC
import ru.terrakok.cicerone.android.SupportFragmentNavigator

/**
 * Created by atabek on 02/13/2018.
 */

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        (application as CiceroneApplication).getRouter().navigateTo(Screens.SCREEN_A)
    }

    override fun onResume() {
        super.onResume()
        (application as CiceroneApplication).getNavigationHolder().setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        (application as CiceroneApplication).getNavigationHolder().removeNavigator()
    }

    private val navigator = object : SupportFragmentNavigator(supportFragmentManager, R.id.container) {
        override fun exit() {
            finish()
        }

        override fun createFragment(screenKey: String?, data: Any?): Fragment? = when(screenKey) {
            Screens.SCREEN_A -> FragmentA()
            Screens.SCREEN_B -> FragmentB()
            Screens.SCREEN_C -> FragmentC()
            else -> null
        }

        override fun showSystemMessage(message: String?) {
            Toast.makeText(this@SecondActivity, message, Toast.LENGTH_SHORT).show()
        }
    }
}