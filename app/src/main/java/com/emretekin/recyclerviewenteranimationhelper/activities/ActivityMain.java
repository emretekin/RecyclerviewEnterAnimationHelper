package com.emretekin.recyclerviewenteranimationhelper.activities;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.os.Bundle;
import android.view.View;

import com.emretekin.recyclerviewenteranimationhelper.BaseActivity;
import com.emretekin.recyclerviewenteranimationhelper.R;

public class ActivityMain extends BaseActivity implements View.OnClickListener {

    private MaterialButton btnFallDown;

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
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        btnFallDown.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.btnFallDown:
                Intent intent = new Intent(ActivityMain.this, ActivityFallDown.class);
                startActivity(intent);
                break;
        }
    }
}
