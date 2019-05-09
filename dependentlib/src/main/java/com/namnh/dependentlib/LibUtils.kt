package com.namnh.dependentlib

import java.lang.RuntimeException

open class LibUtils {
    fun createRuntimeCrash() {
        throw RuntimeException("This crash is came from Lib")
    }

    fun createIllegallCrash() {
        throw IllegalAccessError("You can not access this Lib function")
    }
}