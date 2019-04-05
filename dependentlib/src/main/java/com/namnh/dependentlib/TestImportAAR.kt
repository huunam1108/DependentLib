package com.namnh.dependentlib

import com.mux.stats.sdk.core.model.CustomerPlayerData
import com.mux.stats.sdk.core.model.CustomerVideoData

class TestImportAAR {
    lateinit var playerData: CustomerPlayerData
    lateinit var videoData: CustomerVideoData
    fun main() {
        playerData = CustomerPlayerData()
        videoData = CustomerVideoData()
    }
}
