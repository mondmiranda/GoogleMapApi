package com.example.googlemapapi

import MapsActivity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        Button.setOnClickListener {
            val longitude = longitude.text.toString()
            val latitude = latitude.text.toString()
            val button = Button.text.toString()

            val intent = Intent(this@MainActivity, MapsActivity::class.java)
            intent.putExtra(MapsActivity.longitude, longitude)
            intent.putExtra(MapsActivity.latitude, latitude)
            intent.putExtra(MapsActivity.Button, button)
            startActivity(intent)
        }

    }


}
