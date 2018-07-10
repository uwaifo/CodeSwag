package com.overstandapp.codeswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.overstandapp.codeswag.Model.Category
import com.overstandapp.codeswag.R

class CategoryAdapter(instContext: Context, instCategories: List<Category>) : BaseAdapter() {

    val myContext = instContext
    val myCategories = instCategories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(myContext).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName :  TextView = categoryView.findViewById(R.id.categoryName)

        val category = myCategories[position]

        val resourceId = myContext.resources.getIdentifier(category.image,"drawable",
                myContext.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId )

        categoryName.text = category.title
        return categoryView


    }

    override fun getItem(position: Int): Any {
        return myCategories[position]
         }

    override fun getItemId(position: Int): Long {
        return 0
         }

    override fun getCount(): Int {
        return myCategories.count()

    }
}