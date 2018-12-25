package com.emretekin.recyclerviewenteranimationhelper.activities

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.emretekin.recyclerviewenteranimationhelper.base.BaseActivity
import com.emretekin.recyclerviewenteranimationhelper.R
import com.emretekin.recyclerviewenteranimationhelper.utils.AppConstants
import com.emretekin.recyclerviewenteranimationhelper.utils.setFallDownAnim

class ActivityExtensionFunc : BaseActivity() {

    //Views
    private lateinit var rvItems: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_func)

        rvItems = findViewById(R.id.rvItems)
        rvItems.setFallDownAnim(this, rvItems, AppConstants.MEDIUM)
    }
}
