package com.projecttango.videooverlaynative;

public class TangoJNINative {
	static {
		System.loadLibrary("tango-native-jni");
	}

	public static native void OnCreate();

	public static native void OnResume();

	public static native void OnPause();

	public static native void OnDestroy();

	public static native void SetupGraphic(int width, int height);

	public static native void Render();
}