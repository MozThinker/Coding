package com.example.emutombene.gdgmaputo


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.emutombene.gdgmaputo.beacon.BeaconActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btProjecto = findViewById<View>(R.id.btn_beacon);
        btProjecto.setOnClickListener{
            openProject("Beacon")
        }
    }


    public fun openProject(projecto: String) {
        when (projecto) {
            "Beacon" -> {
                startActivity(Intent(this, BeaconActivity::class.java))
            }
        }
        false
    }
}
