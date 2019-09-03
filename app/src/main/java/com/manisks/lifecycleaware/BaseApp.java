package com.manisks.lifecycleaware;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by user on 03-09-2019.
 */
public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
