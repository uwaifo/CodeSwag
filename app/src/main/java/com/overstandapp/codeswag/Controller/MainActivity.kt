package com.overstandapp.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.overstandapp.codeswag.Adapters.CategoryAdapter
import com.overstandapp.codeswag.Adapters.CategoryRecycleAdapter
import com.overstandapp.codeswag.Model.Category
import com.overstandapp.codeswag.R
import com.overstandapp.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var myAdapter : ArrayAdapter<Category>
    //lateinit var myAdapter : CategoryAdapter
    lateinit var myAdapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        myAdapter = ArrayAdapter(
//                this,
//                android.R.layout.simple_list_item_1,
//                DataService.categories
//                )
        //myAdapter = CategoryAdapter(this, DataService.categories)
        myAdapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = myAdapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


//
//        categoryListView.setOnItemClickListener{ adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "you clicked on the ${category.title} cell",
//                    Toast.LENGTH_SHORT
//                    ).show()

//          }
    }
}
