package com.quadible.gesturetracker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class AppGesturesLogger {

    private static AppGesturesLogger sInstance;

    private static AppGesturesLoggerLifecycleCallbacks mCallback =
            new AppGesturesLoggerLifecycleCallbacks();

    private AppGesturesLogger() {
    }

    public static AppGesturesLogger getInstance() {
        if (sInstance == null) sInstance = new AppGesturesLogger();
        return sInstance;
    }

    public void register(Application application) {
        application.registerActivityLifecycleCallbacks(mCallback);
    }

    private static class AppGesturesLoggerLifecycleCallbacks
            implements Application.ActivityLifecycleCallbacks {


        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            final GestureDetector detector = new GestureDetector(activity, new GestureListener());

            activity.getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return detector.onTouchEvent(motionEvent);
                }
            });
        }

        @Override
        public void onActivityStarted(Activity activity) {

        }

        @Override
        public void onActivityResumed(Activity activity) {

        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            activity.getWindow().getDecorView().setOnTouchListener(null);
        }

    }

}
