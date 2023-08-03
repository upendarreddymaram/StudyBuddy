package com.example.studybuddy.fragments.college

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studybuddy.R

class CollegeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var editText: EditText
    private lateinit var adapter: CollegeListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_college, container, false)

        recyclerView = view.findViewById(R.id.college_recycler)
        editText = view.findViewById(R.id.searchView)

        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = CollegeListAdapter(getCollegeData())
        recyclerView.adapter = adapter

        return view
    }

    data class CollegeData(
        val id: Int,
        val collegeimage: Int,
        val collegetitle: String,
        val collegesubtitle: String
    )

    private fun getCollegeData(): List<CollegeData> {
        val dataList = mutableListOf<CollegeData>()

        dataList.add(
            CollegeData(
                1,
                R.drawable.splash_image,
                "College Full Name, Hyderabad 1",
                "College Address and text, Gachibowli hyderabad Telangana "
            )
        )
        dataList.add(
            CollegeData(
                2,
                R.drawable.splash_image,
                "College Full Name, Hyderabad 2",
                "College Address and text"
            )
        )
        dataList.add(
            CollegeData(
                3,
                R.drawable.splash_image,
                "College Full Name, Hyderabad 3",
                "College Address and text"
            )
        )

        return dataList

    }

    inner class CollegeListAdapter(private val data: List<CollegeData>) :
        RecyclerView.Adapter<CollegeListAdapter.CollegeListViewHolder>() {
        inner class CollegeListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val collegeimage: ImageView = itemView.findViewById(R.id.itemImageView)
            val collegetitle: TextView = itemView.findViewById(R.id.college_name)
            val collegesubtitle: TextView = itemView.findViewById(R.id.college_subtext)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollegeListViewHolder {
            val itemView =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_college_list, parent, false)

            return CollegeListViewHolder(itemView)

        }

        @SuppressLint("CommitTransaction")
        override fun onBindViewHolder(holder: CollegeListViewHolder, position: Int) {
            val item = data[position]

            holder.collegeimage.setImageResource(item.collegeimage)
            holder.collegetitle.text = item.collegetitle
            holder.collegesubtitle.text = item.collegesubtitle
        }

        override fun getItemCount(): Int {
            return data.size
        }
    }

}