package com.example.epicaesthetic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.epicaesthetic.databinding.ActivityMainBinding
import com.example.epicaesthetic.ui.LoginActivity
import com.example.epicaesthetic.ui.aesthetic.AestheticFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navView: BottomNavigationView = _binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_profile,
            R.id.navigation_aesthetic,
            R.id.navigation_all,
            R.id.navigation_epic,
            R.id.navigation_compare))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setOnNavigationItemSelectedListener {
            when (it.itemId)
            {
                R.id.navigation_profile ->
                {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    //return@setOnNavigationItemSelectedListener false
                }
                R.id.navigation_aesthetic ->
                {
                    var aestheticFragment = AestheticFragment()

                    supportFragmentManager.beginTransaction()
                        .add(R.id.nav_host_fragment_container, aestheticFragment, "AestheticFragment")
                        .addToBackStack(null)
                        .commit()

                    //return@setOnNavigationItemSelectedListener false
                }
            }
            true
        }
    }
}