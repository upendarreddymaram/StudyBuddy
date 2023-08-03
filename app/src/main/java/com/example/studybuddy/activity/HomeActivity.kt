//package com.example.studybuddy.activity
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.fragment.app.Fragment
//import com.example.studybuddy.R
//import com.example.studybuddy.databinding.FragmentHomeBinding
//import com.example.studybuddy.fragments.college.CollegeFragment
//import com.example.studybuddy.fragments.privatecontent.PrivateContentFragment
//import com.example.studybuddy.fragments.search.SearchFragment
//import com.example.studybuddy.fragments.user.UserFragment
//import com.google.android.material.bottomnavigation.BottomNavigationView
//
//class HomeActivity: AppCompatActivity() {
//
//    private lateinit var binding: FragmentHomeBinding
//
//    @SuppressLint("ResourceType", "MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomBar)
//
////        replaceFragment(HomeFragment())
//        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.college_fragment -> {
//                    replaceFragment(CollegeFragment())
//                    true
//                }
//                R.id.private_fragment -> {
//                    replaceFragment(PrivateContentFragment())
//                    true
//                }
////                R.id.home_fragment -> {
////                    replaceFragment(HomeFragment())
////                    true
////                }
//                R.id.user_fragment -> {
//                    replaceFragment(UserFragment())
//                    true
//                }
//                R.id.settings_fragment -> {
//                    replaceFragment(SearchFragment())
//                    true
//                }
//                else -> false
//            }
//        }
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
