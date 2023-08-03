package com.example.studybuddy.fragments.privatecontent

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.studybuddy.R
import com.example.studybuddy.databinding.FragmentPrivatecontentBinding
import com.example.studybuddy.fragments.privatecontent.faculty.FacultyLoginFragment
import com.example.studybuddy.fragments.privatecontent.student.StudentLoginFragment
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth

class PrivateContentFragment : Fragment() {
//    private lateinit var privateContentViewModel: PrivateContentViewModel
    private lateinit var binding: FragmentPrivatecontentBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_privatecontent, container, false)

        tabLayout = view.findViewById(R.id.tabLayout)
        viewPager = view.findViewById(R.id.viewpager)

        tabLayout.addTab(tabLayout.newTab().setText("Student"))
        tabLayout.addTab(tabLayout.newTab().setText("Faculty"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = context?.let { TabAdapter(it, childFragmentManager, tabLayout.tabCount) }
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        return view
    }

    class TabAdapter(private val myContext: Context, fm: FragmentManager, private var totalTabs: Int) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> {
                    StudentLoginFragment()
                }
                1 -> {
                    FacultyLoginFragment()
                }
                else -> StudentLoginFragment()
            }
        }

        override fun getCount(): Int {
            return totalTabs
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentPrivatecontentBinding.bind(view)
        auth = FirebaseAuth.getInstance()

//        binding.loginButton.setOnClickListener{
//
//            if(binding.loginText.text.isNotEmpty() && binding.passwordText.text.isNotEmpty()){
//                signInUser(binding.loginText.text.toString(), binding.passwordText.text.toString())
//            }else{
//                requireActivity().toast("Enter all Fields")
//            }
//        }
    }

//    private fun signInUser(email: String, password: String) {
//
//        auth.signInWithEmailAndPassword(email, password)
//            .addOnCompleteListener { task ->
//
//                if (task.isSuccessful) {
//
//                    requireActivity().toast("Sign In Successful")
//
//                    Navigation.findNavController(requireActivity(), R.id.fragment_container)
//                        .navigate(R.id.home_fragment)
//                } else {
//                    requireActivity().toast(task.exception!!.localizedMessage!!)
//
//                }
//            }
//
//    }
//
//    fun Activity.toast(msg:String){
//        Toast.makeText(this , msg , Toast.LENGTH_SHORT).show()
//    }
}