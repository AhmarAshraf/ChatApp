package com.codemonkeys.ahmar.chatapp;

import android.app.Application;

/**
 * Created by Ahmar on 15/04/2017.
 */

public class FirebaseChatMainApp extends Application {



    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        FirebaseChatMainApp.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
