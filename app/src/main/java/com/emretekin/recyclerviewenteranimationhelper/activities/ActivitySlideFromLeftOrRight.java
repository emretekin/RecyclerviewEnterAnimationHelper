package com.emretekin.recyclerviewenteranimationhelper.activities;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.emretekin.recyclerviewenteranimationhelper.base.BaseActivity;
import com.emretekin.recyclerviewenteranimationhelper.R;
import com.emretekin.recyclerviewenteranimationhelper.adapters.ItemsAdapter;
import com.emretekin.recyclerviewenteranimationhelper.utils.AnimUtils;
import com.emretekin.recyclerviewenteranimationhelper.utils.AppConstants;

import java.util.ArrayList;

public class ActivitySlideFromLeftOrRight extends BaseActivity {

    // Arrays
    private ArrayList<String> items = new ArrayList<>();

    //Views
    private RecyclerView rvItems;
    private MaterialButton btnMedium, btnLong;

    //Utils
    private ItemsAdapter itemsAdapter;

    //Variables
    private String direction = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall_down);

        getIntentExtra();
        createViews();
        setUI();
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

    private void setUI() {
        if (direction != null) {
            btnMedium.setVisibility(View.GONE);
            btnLong.setVisibility(View.GONE);
        }
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsAdapter.notifyDataSetChanged();
                AnimUtils.setRecylerviewSlideFromRightAnim(ActivitySlideFromLeftOrRight.this, rvItems);
                rvItems.scheduleLayoutAnimation();
            }
        });
        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsAdapter.notifyDataSetChanged();
                AnimUtils.setRecylerviewSlideFromRightAnim(ActivitySlideFromLeftOrRight.this, rvItems);
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
        runLayoutAnimation();
    }

    private void runLayoutAnimation() {
        if (direction.equalsIgnoreCase(AppConstants.LEFT)) {
            AnimUtils.setRecylerviewSlideFromLeftAnim(ActivitySlideFromLeftOrRight.this, rvItems);
        } else {
            AnimUtils.setRecylerviewSlideFromRightAnim(ActivitySlideFromLeftOrRight.this, rvItems);
        }
    }

    private void getIntentExtra() {
        Intent intent = getIntent();
        if (intent != null) {
            direction = intent.getStringExtra(AppConstants.INTENT_DIRECTION_INFO);
        }
    }
}
