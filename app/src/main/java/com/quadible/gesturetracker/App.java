package com.quadible.gesturetracker;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppGesturesLogger.getInstance().register(this);
    }
}
