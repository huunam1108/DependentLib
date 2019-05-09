package com.namnh.dependentlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.sentry.Sentry
import io.sentry.android.AndroidSentryClientFactory

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sentry.init("https://48f11c14a0c54806ad34d26a926f0345@sentry.io/1455682", AndroidSentryClientFactory(this))
    }
}
