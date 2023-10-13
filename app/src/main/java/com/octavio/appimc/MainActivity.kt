package com.octavio.appimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.octavio.appimc.configuracion.SettingActivity
import com.octavio.appimc.imccalculator.ImcActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnSettings = findViewById<Button>(R.id.btnSetting)

        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnSettings.setOnClickListener { navigateToSettings() }


    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSettings() {
        val intent = Intent(this, SettingActivity::class.java)
        startActivity(intent)
    }


}