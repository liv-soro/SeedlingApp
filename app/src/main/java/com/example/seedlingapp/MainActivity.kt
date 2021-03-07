package com.example.seedlingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvEmail : TextView = findViewById(R.id.tvEmail)
        val tvPassword : TextView = findViewById(R.id.tvPassword)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent);
        }



/*        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)//
        val navController = findNavController(R.id.fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.infoFragment, R.id.accountFragment, R.id.homeFragment, R.id.scanFragment))
        setupActionBarWithNavController(navController)

        bottomNavigationView.setupWithNavController(navController)*/




       /* val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)*/
    }
}