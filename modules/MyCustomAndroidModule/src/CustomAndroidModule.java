package org.godotengine.godot;

import android.app.Activity;
import com.godot.game.R;

public class CustomAndroidModule extends Godot.SingletonBase {

    public int getValue(int a, int b) {
        return a + b;
    }

    static public Godot.SingletonBase initialize(Activity p_activity) {
        return new CustomAndroidModule(p_activity);
    }

    public CustomAndroidModule(Activity p_activity) {
        //register class name and functions to bind
        registerClass("CustomAndroidModule", new String[] {
            "getValue"
        });
    }

    // forwarded callbacks you can reimplement, as SDKs often need them
    /*
    protected void onMainActivityResult(int requestCode, int resultCode, Intent data) {}
    protected void onMainRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {}

    protected void onMainPause() {}
    protected void onMainResume() {}
    protected void onMainDestroy() {}

    protected void onGLDrawFrame(GL10 gl) {}
    protected void onGLSurfaceChanged(GL10 gl, int width, int height) {} // singletons will always miss first onGLSurfaceChanged call
    */
}