package com.asad.animateaction

import android.animation.ValueAnimator
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.transition.Fade
import androidx.transition.Transition
import androidx.transition.TransitionManager

fun View.fadeVisibility(visibility: Int, duration: Long = 400) {
    val transition: Transition = Fade()
    transition.duration = duration
    transition.addTarget(this)
    TransitionManager.beginDelayedTransition(this.parent as ViewGroup, transition)
    this.visibility = visibility
}

fun View.animateHeightFromTo(
    initialHeight: Int,
    finalHeight: Int
): ValueAnimator {
    val animator = ValueAnimator.ofInt(initialHeight, finalHeight)
    animator.duration = 1000
    animator.addUpdateListener {
        val value = it.animatedValue as Int
        val lp = this.layoutParams
        lp.height = value
        this.layoutParams = lp
        isVisible = value != 0
    }
    animator.start()
    return animator
}

fun View.animateWidthFromTo(
    initialHeight: Int,
    finalHeight: Int
): ValueAnimator {
    val animator = ValueAnimator.ofInt(initialHeight, finalHeight)
    animator.duration = 1000
    animator.addUpdateListener {
        val value = it.animatedValue as Int
        val lp = this.layoutParams
        lp.width = value
        this.layoutParams = lp
        isVisible = value != 0
    }
    animator.start()
    return animator
}