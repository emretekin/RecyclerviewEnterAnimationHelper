package com.emretekin.recyclerviewenteranimationhelper.activities;

import android.content.Context;
import android.support.design.button.MaterialButton;
import android.support.design.chip.Chip;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.CompoundButton;

import com.emretekin.recyclerviewenteranimationhelper.BaseActivity;
import com.emretekin.recyclerviewenteranimationhelper.R;
import com.emretekin.recyclerviewenteranimationhelper.adapters.ItemsAdapter;
import com.emretekin.recyclerviewenteranimationhelper.utils.AnimUtils;
import com.emretekin.recyclerviewenteranimationhelper.utils.AppConstants;

import java.util.ArrayList;

public class ActivityFallDown extends BaseActivity {

    // Arrays
    ArrayList<String> items = new ArrayList<>();

    //Views
    private RecyclerView rvItems;
    private MaterialButton btnMedium, btnLong;

    //Utils
    ItemsAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall_down);

        createViews();
        setListeners();
        addDummyItemsToList();
        initRecyclerView();
    }

    @Override
    protected void createViews() {
        super.createViews();
        rvItems = findViewById(R.id.rvItems);
        btnMedium = findViewById(R.id.btn_medium);
        btnLong = findViewById(R.id.btn_long);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsAdapter.notifyDataSetChanged();
                AnimUtils.setRecylerviewFallDownAnim(ActivityFallDown.this, rvItems, AppConstants.MEDIUM);
                rvItems.scheduleLayoutAnimation();
            }
        });
        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsAdapter.notifyDataSetChanged();
                AnimUtils.setRecylerviewFallDownAnim(ActivityFallDown.this, rvItems, AppConstants.LONG);
                rvItems.scheduleLayoutAnimation();
            }
        });
    }

    private void addDummyItemsToList() {
        for (int i = 0; i < 40; i++) {
            items.add("Dummy");
        }
    }

    @Override
    protected void initRecyclerView() {
        super.initRecyclerView();
        itemsAdapter = new ItemsAdapter(items);
        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.setAdapter(itemsAdapter);
        AnimUtils.setRecylerviewFallDownAnim(ActivityFallDown.this, rvItems, AppConstants.LONG);
    }
}