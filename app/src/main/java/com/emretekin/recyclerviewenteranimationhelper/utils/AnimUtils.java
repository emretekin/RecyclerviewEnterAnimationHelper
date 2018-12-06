package com.emretekin.recyclerviewenteranimationhelper.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.emretekin.recyclerviewenteranimationhelper.R;


/**
 * Created by emretekin on 31.07.2018.
 */

public final class AnimUtils {

    public AnimUtils() {

    }

    public static void setRecylerviewFallDownAnim(Context context, RecyclerView recyclerView, int duration) {
        LayoutAnimationController animation;
        if (duration == AppConstants.MEDIUM) {
            animation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down_medium);
            recyclerView.setLayoutAnimation(animation);
        } else if (duration == AppConstants.LONG) {
            animation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down_long);
            recyclerView.setLayoutAnimation(animation);
        }
    }

//    public static void setRecylerviewRightToLeftAnimWithDur500(Context context, RecyclerView recyclerView){
//        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down_dur500);
//        recyclerView.setLayoutAnimation(animation);
//    }
}
