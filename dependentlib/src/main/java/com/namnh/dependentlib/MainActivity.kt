package com.namnh.dependentlib

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        testAar()
    }

    private fun testAar() {
        val test = TestImportAAR()
        test.main()
        Toast.makeText(this, "${test.playerData} is not null", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "${test.videoData} is not null", Toast.LENGTH_LONG).show()
    }

}
