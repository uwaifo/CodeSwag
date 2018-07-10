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
        val holder: ViewHolder

        if (convertView == null) {

            categoryView = LayoutInflater.from(myContext).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I  exist for the first time ")

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green recyle!")
        }

        val category = myCategories[position]
        val resourceId = myContext.resources.getIdentifier(category.image,"drawable",
                myContext.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
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

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName : TextView? = null
    }
}