package com.xspotlivin.example.mapboxsnapshotcrash

import android.app.Application
import com.mapbox.common.MapboxOptions

class SnapshotApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        MapboxOptions.accessToken = "MAPBOX_ACCESS_TOKEN"
    }
}
