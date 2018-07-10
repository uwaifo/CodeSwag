package com.overstandapp.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.overstandapp.codeswag.Model.Category
import com.overstandapp.codeswag.R
import com.overstandapp.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAdapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                DataService.categories
                )

        categoryListView.adapter = myAdapter
    }
}
