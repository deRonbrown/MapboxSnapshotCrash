package com.xspotlivin.example.mapboxsnapshotcrash

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.maps.MapView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.snapshotButton).setOnClickListener {
            findViewById<MapView>(R.id.mapView).snapshot { bitmap ->
                runOnUiThread {
                    findViewById<ImageView>(R.id.snapshotImageView).setImageBitmap(bitmap)
                }
            }
        }
    }
}
