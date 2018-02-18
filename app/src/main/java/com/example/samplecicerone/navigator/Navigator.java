package com.example.samplecicerone.navigator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.samplecicerone.Screens;
import com.example.samplecicerone.secondscreen.fragment.FragmentA;
import com.example.samplecicerone.secondscreen.fragment.FragmentB;
import com.example.samplecicerone.secondscreen.fragment.FragmentC;

/**
 * Created by atabek on 02/15/2018.
 */

public class Navigator {
    private FragmentManager fragmentManager;
    private int containerId;

    public Navigator(FragmentManager fragmentManager, int containerId) {
        this.fragmentManager = fragmentManager;
        this.containerId = containerId;
    }

    void switchToNext(String currentScreenKey) {
        fragmentManager.beginTransaction()
            .replace(containerId, getNextFragment(currentScreenKey))
            .addToBackStack(currentScreenKey)
            .commit();
    }

    private Fragment getNextFragment(String currentScreenKey) {
        switch (currentScreenKey) {
            case Screens.SCREEN_A:
                return new FragmentB();
            case Screens.SCREEN_B:
                return new FragmentC();
            default:
                return new FragmentA();
        }
    }

    void handleBack() {
        if (fragmentManager.getBackStackEntryCount() > 1) {
            fragmentManager.popBackStackImmediate();
        } else {
            Fragment fragment = fragmentManager.getFragments().get(0);
            fragment.getActivity().finish();
        }
    }
}
