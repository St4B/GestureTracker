package com.quadible.gesturetracker;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureListener implements GestureDetector.OnGestureListener {

    private static final String TAG = GestureListener.class.getSimpleName();

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Log.d(TAG, "onDown() called with: motionEvent = [" + motionEvent + "]");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        Log.d(TAG, "onShowPress() called with: motionEvent = [" + motionEvent + "]");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Log.d(TAG, "onSingleTapUp() called with: motionEvent = [" + motionEvent + "]");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(TAG, "onScroll() called with: motionEvent = [" + motionEvent + "], motionEvent1 = ["
                + motionEvent1 + "], v = [" + v + "], v1 = [" + v1 + "]");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        Log.d(TAG, "onLongPress() called with: motionEvent = [" + motionEvent + "]");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(TAG, "onFling() called with: motionEvent = [" + motionEvent + "], motionEvent1 = ["
                + motionEvent1 + "], v = [" + v + "], v1 = [" + v1 + "]");
        return false;
    }
}
