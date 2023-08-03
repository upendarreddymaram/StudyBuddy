package com.example.studybuddy.fragments.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studybuddy.R

class HomeFragment: Fragment() {
//    private lateinit var homeViewModel: HomeViewModel
//    private lateinit var binding:FragmentHomeBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //top public content recycler view
        val publicRecyclerView: RecyclerView = view.findViewById(R.id.public_recycler)
        val imageList: List<Int> = getImageList()
        val imageAdapter = PublicImageAdapter(imageList)
        publicRecyclerView.adapter = imageAdapter
        publicRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        //top college event recycler view

        val eventRecyclerView: RecyclerView = view.findViewById(R.id.event_recycler)
        val itemList = createItemList()
        val myAdapter = CollegeEventAdapter(itemList)
        eventRecyclerView.adapter = myAdapter
        eventRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        return view
    }
    private fun getImageList(): List<Int> {
        return listOf(
            R.drawable.home_img1,
            R.drawable.home_img2,
            R.drawable.home_img3,
            R.drawable.home_img1,
            R.drawable.splash_image,
            R.drawable.splash_image,
        )
    }
    class PublicImageAdapter(private val imageList: List<Int>) : RecyclerView.Adapter<PublicImageAdapter.PublicImageViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublicImageViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_public_content, parent, false)
            return PublicImageViewHolder(view)
        }

        override fun onBindViewHolder(holder: PublicImageViewHolder, position: Int) {
            val imageResId = imageList[position]
            holder.imageView.setImageResource(imageResId)
        }

        override fun getItemCount(): Int {
            return imageList.size
        }

        class PublicImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imageView: ImageView = itemView.findViewById(R.id.item_imageView)
        }
    }

    private fun createItemList(): List<CollegeEventData> {
        return listOf(
            CollegeEventData(R.drawable.home_img1, "College Feast and Event Name Displays Here", "College Name and Address Displays here"),
            CollegeEventData(R.drawable.home_img2, "College Feast and Event Name Displays Here", "College Name and Address Displays here"),
            CollegeEventData(R.drawable.home_img3, "College Feast and Event Name Displays Here", "College Name and Address Displays here"),
            CollegeEventData(R.drawable.splash_image, "College Feast and Event Name Displays Here", "College Name and Address Displays here"),
            CollegeEventData(R.drawable.splash_image, "College Feast and Event Name Displays Here", "College Name and Address Displays here"),
            CollegeEventData(R.drawable.splash_image, "College Feast and Event Name Displays Here", "College Name and Address Displays here"),

        )
    }

    data class CollegeEventData(val imageResId: Int, val rightText: String, val bottomText: String)

    class CollegeEventAdapter(private val itemList: List<CollegeEventData>) : RecyclerView.Adapter<CollegeEventAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_college_events, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemData = itemList[position]
            holder.imageView.setImageResource(itemData.imageResId)
            holder.rightTextView.text = itemData.rightText
            holder.bottomTextView.text = itemData.bottomText
        }

        override fun getItemCount(): Int {
            return itemList.size
        }

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imageView: ImageView = itemView.findViewById(R.id.event_imageView)
            val rightTextView: TextView = itemView.findViewById(R.id.event_rightTextView)
            val bottomTextView: TextView = itemView.findViewById(R.id.event_bottomTextView)
        }
    }


}