package com.namnh.dependentlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.sentry.Sentry
import io.sentry.android.AndroidSentryClientFactory

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (!isSentryAvailable()) return
        Sentry.init("https://48f11c14a0c54806ad34d26a926f0345@sentry.io/1455682", AndroidSentryClientFactory(this))
        try {
            val x = 1 / 0
        } catch (e: Exception) {
            Sentry.capture(e)
        }

        try {
            val libUtils = LibUtils()
            libUtils.createRuntimeCrash()
        } catch (e: RuntimeException) {
            Sentry.capture(e)
        }
    }

    private fun isSentryAvailable(): Boolean {
        try {
            Class.forName("io.sentry.Sentry")
            return true
        } catch (ignored: ClassNotFoundException) {
        }
        return false
    }
}
