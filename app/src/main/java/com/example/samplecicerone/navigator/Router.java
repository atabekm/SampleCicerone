package com.example.samplecicerone.navigator;

/**
 * Created by atabek on 02/15/2018.
 */

public class Router {
    private Navigator navigator;

    public Router(Navigator navigator) {
        this.navigator = navigator;
    }

    public void navigateTo(String currentScreen) {
        if (navigator != null) {
            navigator.switchToNext(currentScreen);
        }
    }

    public void back() {
        if (navigator != null) {
            navigator.handleBack();
        }
    }
}
