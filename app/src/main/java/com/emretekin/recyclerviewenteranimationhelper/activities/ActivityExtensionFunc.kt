package com.emretekin.recyclerviewenteranimationhelper.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.emretekin.recyclerviewenteranimationhelper.base.BaseActivity
import com.emretekin.recyclerviewenteranimationhelper.R
import com.emretekin.recyclerviewenteranimationhelper.adapters.ItemsAdapter
import com.emretekin.recyclerviewenteranimationhelper.utils.AppConstants
import com.emretekin.recyclerviewenteranimationhelper.utils.setFallDownAnim
import java.util.ArrayList

class ActivityExtensionFunc : BaseActivity() {

    // Arrays
    internal var items = ArrayList<String>()

    //Views
    private lateinit var rvItems: RecyclerView

    //Utils
    internal lateinit var itemsAdapter: ItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_func)

        createViews()
        addDummyItemsToList()
        initRecyclerView()
    }

    override fun createViews() {
        super.createViews()
        rvItems = findViewById(R.id.rvItems)
    }

    fun addDummyItemsToList(){
        for (i in 1..40){
            items.add("Dummy")
        }
    }

    override fun initRecyclerView() {
        super.initRecyclerView()
        itemsAdapter = ItemsAdapter(items)
        rvItems.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvItems.adapter = itemsAdapter
        rvItems.setFallDownAnim(this, rvItems, AppConstants.MEDIUM)
    }
}
