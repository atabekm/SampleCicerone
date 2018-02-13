package com.example.samplecicerone.secondscreen.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.samplecicerone.CiceroneApplication
import com.example.samplecicerone.R
import com.example.samplecicerone.Screens
import ru.terrakok.cicerone.Router

/**
 * Created by atabek on 02/13/2018.
 */

class FragmentB: Fragment() {
    private lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        router = (activity.application as CiceroneApplication).getRouter()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_b, container, false)
        view?.findViewById<Button>(R.id.bGoToFragmentC)?.setOnClickListener {
            router.navigateTo(Screens.SCREEN_C)
        }
        view?.findViewById<Button>(R.id.bGoToBack)?.setOnClickListener {
            router.backTo(Screens.SCREEN_A)
        }
        return view
    }

}