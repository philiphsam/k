package com.kerberos.kuku_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kerberos.kuku_demo.fragment.BuyFragment
import com.kerberos.kuku_demo.fragment.InfoFragment
import com.kerberos.kuku_demo.fragment.SellFragment

class MainActivity : AppCompatActivity() {

    var selectedFragment: Fragment? = null
    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item -> // By using switch we can easily get
            // the selected fragment
            // by using there id.
            when (item.itemId) {
                R.id.buy -> selectedFragment = BuyFragment()
                R.id.sell -> selectedFragment = SellFragment()
                R.id.info -> selectedFragment = InfoFragment()
            }
            // It will help to replace the
            // one fragment to other.
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentHolder, selectedFragment!!)
                .commit()
            true
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnNavigationItemSelectedListener(navListener)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentHolder, BuyFragment())
            .commit()
    }
}