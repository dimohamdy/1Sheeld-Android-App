package com.integreight.onesheeld.utils;

public class Log {
	public static void d(String tag, String msg) {
//		 android.util.Log.d(tag, msg);
	}

	public static void test(String tag, String msg) {
		 android.util.Log.d(tag, msg);
	}
	public static void i(String tag, String msg) {
		// android.util.Log.d(tag, msg);
	}

	public static void e(String tag, String msg, Throwable tr) {
		// tr.printStackTrace();
		// android.util.Log.d(tag, msg);
	}

	public static void e(String tag, String msg) {
		// android.util.Log.e(tag, msg);
	}

	public static void sysOut(String msg) {
		// System.out.println(msg);
	}
}