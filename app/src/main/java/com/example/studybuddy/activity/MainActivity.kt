package com.example.studybuddy.activity

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.WindowInsetsController
import android.widget.PopupMenu
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.studybuddy.R
import com.example.studybuddy.databinding.ActivityMainBinding
import com.example.studybuddy.fragments.college.CollegeFragment
import com.example.studybuddy.fragments.home.HomeFragment
import com.example.studybuddy.fragments.privatecontent.PrivateContentFragment
import com.example.studybuddy.fragments.settings.SettingsFragment
import com.example.studybuddy.fragments.user.UserFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_fragment) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomBar)
        NavigationUI.setupWithNavController(bottomNavigationView,navController)

        bottomNavigationView.setBackgroundResource(R.color.bottom_menu_color)

        navController.addOnDestinationChangedListener{_, item, _ ->
            when(item.id){
                R.id.college_fragment ->{
                    window.statusBarColor =getColor(R.color.item_color)
                    window.decorView.windowInsetsController?.setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS)
                }
                R.id.private_fragment -> {
                    window.statusBarColor =getColor(R.color.item_color)
                    window.decorView.windowInsetsController?.setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS)
                }
                R.id.home_fragment -> {
                    window.statusBarColor =getColor(R.color.item_color)
                    window.decorView.windowInsetsController?.setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS)
                }
                R.id.user_fragment -> {
                    window.statusBarColor =getColor(R.color.item_color)
                    window.decorView.windowInsetsController?.setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS)
                }
                R.id.settings_fragment -> {
                    window.statusBarColor =getColor(R.color.item_color)
                    window.decorView.windowInsetsController?.setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS)
                }
            }
        }
    }
}








//        bottomNavigationView = findViewById(R.id.bottomBar)

//        navController = Navigation.findNavController(this,R.id.main_fragment)
//        setupWithNavController(binding.bottomBar, navController)
//
//        replaceFragment(HomeFragment())
//        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.college_fragment -> {
//                    // Handle the Home fragment or activity
//                    replaceFragment(CollegeFragment())
//                    true
//                }
//                R.id.private_fragment -> {
//                    replaceFragment(PrivateContentFragment())
//                    true
//                }
//                R.id.home_fragment -> {
//                    replaceFragment(HomeFragment())
//                    true
//                }
//                R.id.user_fragment -> {
//                    replaceFragment(UserFragment())
//                    true
//                }
//                R.id.settings_fragment -> {
//                    replaceFragment(SettingsFragment())
//                    true
//                }
//                else -> false
//            }
//        }
//        // Set the default fragment
//
//        if (savedInstanceState == null) {
//            bottomNavigationView.selectedItemId = R.id.home_fragment
//        }
//        bottomNavigationView.setBackgroundResource(R.color.bottom_menu_color)
////        bottomNavigationView.selectedItemId = R.color.white
//
//    }
//    private fun replaceFragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment_container, fragment)
//            .commit()
//    }
//}

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        navController = findNavController(R.id.main_fragment)
////        setupActionBarWithNavController(navController)
////        setupSmoothBottomMenu()
//    }
//    fun setSelectedItem(pos:Int){
//        binding.bottomBar.setSelectedItem(pos)
//    }
//    fun setBadge(pos:Int){
//        binding.bottomBar.setBadge(pos)
//    }
//    fun removeBadge(pos:Int){
//        binding.bottomBar.removeBadge(pos)
//    }

//    private fun showToast(msg: String) {
//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
//    }
//
//    private fun setupSmoothBottomMenu() {
//        val popupMenu = PopupMenu(this, null)
//        popupMenu.inflate(R.menu.bottom_menu)
//        val menu = popupMenu.menu
//        binding.bottomBar.setupWithNavController(menu, navController)
//        binding.bottomBar.setupWithNavController( navController)
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
//}
