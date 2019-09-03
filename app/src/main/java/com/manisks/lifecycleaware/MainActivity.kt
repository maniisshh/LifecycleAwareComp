package com.manisks.lifecycleaware

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.d("Observer Added")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("Observer Removed")
        lifecycle.removeObserver(MainActivityObserver())
    }
}
