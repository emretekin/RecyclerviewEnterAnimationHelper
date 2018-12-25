package com.emretekin.recyclerviewenteranimationhelper.base;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.emretekin.recyclerviewenteranimationhelper.R;

/**
 * Created by emretekin on 21/01/18.
 */

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    Context context = this;

    protected void createViews() {
    }

    protected void setValues() {

    }

    protected void setListeners() {
    }

    protected void initRecyclerView() {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.right_to_left_in, R.anim.right_to_left_exit);
    }

    public void overridePendingTransitionExit() {
        overridePendingTransition(R.anim.left_to_right_in, R.anim.left_to_right_exit);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransitionExit();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransitionEnter();
    }

    @Override
    public void onClick(View view) {

    }
}
