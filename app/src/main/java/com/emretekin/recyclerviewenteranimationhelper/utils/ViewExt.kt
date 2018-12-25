package com.emretekin.recyclerviewenteranimationhelper.utils

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.emretekin.recyclerviewenteranimationhelper.activities.ActivityExtensionFunc
import com.emretekin.recyclerviewenteranimationhelper.activities.ActivityMain



    fun RecyclerView.setFallDownAnim(context: Context, recyclerView: RecyclerView, duration: Int) {
        AnimUtils.setRecylerviewFallDownAnim(context, recyclerView, duration)
    }

    fun AppCompatActivity.startActivityExtensionFunc() {
        val intent = Intent(this.applicationContext, ActivityExtensionFunc::class.java)
        this.startActivity(intent)
    }
