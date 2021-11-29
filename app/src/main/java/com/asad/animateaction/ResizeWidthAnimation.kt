package com.asad.animateaction

import android.view.View
import android.view.animation.Animation
import android.view.animation.Transformation

class ResizeWidthAnimation(private val mView: View, private val mWidth: Int) : Animation() {
    private val mStartWidth: Int = mView.width

    override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
        mView.layoutParams.width = mStartWidth + ((mWidth - mStartWidth) * interpolatedTime).toInt()
        mView.requestLayout()
    }

    override fun willChangeBounds(): Boolean {
        return true
    }
}