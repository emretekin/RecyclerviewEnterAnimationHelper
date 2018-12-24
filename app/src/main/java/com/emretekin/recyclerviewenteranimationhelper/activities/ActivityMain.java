package com.emretekin.recyclerviewenteranimationhelper.activities;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;

import com.emretekin.recyclerviewenteranimationhelper.BaseActivity;
import com.emretekin.recyclerviewenteranimationhelper.R;
import com.emretekin.recyclerviewenteranimationhelper.utils.AppConstants;

public class ActivityMain extends BaseActivity implements View.OnClickListener {

    //Views
    private MaterialButton btnFallDown, btnSlideFromRight, btnSlideFromLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createViews();
        setListeners();
    }

    @Override
    protected void createViews() {
        super.createViews();
        btnFallDown = findViewById(R.id.btnFallDown);
        btnSlideFromRight = findViewById(R.id.btnSlideRight);
        btnSlideFromLeft = findViewById(R.id.btnSlideLeft);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        btnFallDown.setOnClickListener(this);
        btnSlideFromRight.setOnClickListener(this);
        btnSlideFromLeft.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        Intent intent;
        switch (view.getId()) {
            case R.id.btnFallDown:
                intent = new Intent(ActivityMain.this, ActivityFallDown.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(ActivityMain.this, btnFallDown, ViewCompat.getTransitionName(btnFallDown));
                startActivity(intent, options.toBundle());
                break;
            case R.id.btnSlideRight:
                intent = new Intent(ActivityMain.this, ActivitySlideFromLeftOrRight.class);
                intent.putExtra(AppConstants.INTENT_DIRECTION_INFO, AppConstants.RIGHT);
                startActivity(intent);
                break;
            case R.id.btnSlideLeft:
                intent = new Intent(ActivityMain.this, ActivitySlideFromLeftOrRight.class);
                intent.putExtra(AppConstants.INTENT_DIRECTION_INFO, AppConstants.LEFT);
                startActivity(intent);
                break;
        }
    }
}
