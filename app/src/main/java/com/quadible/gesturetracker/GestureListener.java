package com.quadible.gesturetracker;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureListener implements GestureDetector.OnGestureListener {

    private final String mActivityName;

    public GestureListener(String activityName) {
        mActivityName = activityName;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Log.d(mActivityName, "onDown() called with: motionEvent = [" + motionEvent + "]");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        Log.d(mActivityName, "onShowPress() called with: motionEvent = [" + motionEvent + "]");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Log.d(mActivityName, "onSingleTapUp() called with: motionEvent = [" + motionEvent + "]");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(mActivityName, "onScroll() called with: motionEvent = [" + motionEvent + "], motionEvent1 = ["
                + motionEvent1 + "], v = [" + v + "], v1 = [" + v1 + "]");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        Log.d(mActivityName, "onLongPress() called with: motionEvent = [" + motionEvent + "]");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(mActivityName, "onFling() called with: motionEvent = [" + motionEvent + "], motionEvent1 = ["
                + motionEvent1 + "], v = [" + v + "], v1 = [" + v1 + "]");
        return false;
    }
}
