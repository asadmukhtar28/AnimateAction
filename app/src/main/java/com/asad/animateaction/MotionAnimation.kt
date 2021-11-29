package com.asad.animateaction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.asad.animateaction.databinding.ActivityMotionAnimationBinding

class MotionAnimation : AppCompatActivity() {
    var transitionName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMotionAnimationBinding>(
            this,
            R.layout.activity_motion_animation
        )

        binding.view.setOnClickListener {
            when (transitionName) {
                getString(R.string.interest_anim) ->
                    binding.motionAnim.setTransition(
                        R.id.interests_trans_end,
                        R.id.interests_trans_start
                    )
                getString(R.string.profile_anim) ->
                    binding.motionAnim.setTransition(
                        R.id.profile_trans_end,
                        R.id.profile_trans_start
                    )
                getString(R.string.preference_anim) ->
                    binding.motionAnim.setTransition(
                        R.id.preferences_trans_end,
                        R.id.preferences_trans_start
                    )
                getString(R.string.notification_anim) ->
                    binding.motionAnim.setTransition(
                        R.id.notification_trans_end,
                        R.id.notification_trans_start
                    )
            }

            binding.motionAnim.transitionToEnd()
        }

        binding.tvInterests.setOnClickListener {
            transitionName = getString(R.string.interest_anim)
            binding.motionAnim.transitionName = transitionName
            binding.motionAnim.setTransition(R.id.interests_trans_start, R.id.interests_trans_end)
            binding.motionAnim.transitionToEnd()
        }
        binding.tvPreferences.setOnClickListener {
            transitionName = getString(R.string.preference_anim)
            binding.motionAnim.transitionName = transitionName
            binding.motionAnim.setTransition(
                R.id.preferences_trans_start,
                R.id.preferences_trans_end
            )
            binding.motionAnim.transitionToEnd()
        }
        binding.tvNotifications.setOnClickListener {
            transitionName = getString(R.string.notification_anim)
            binding.motionAnim.transitionName = transitionName
            binding.motionAnim.setTransition(
                R.id.notification_trans_start,
                R.id.notification_trans_end
            )
            binding.motionAnim.transitionToEnd()
        }
        binding.tvProfile.setOnClickListener {
            transitionName = getString(R.string.profile_anim)
            binding.motionAnim.transitionName = transitionName
            binding.motionAnim.setTransition(
                R.id.profile_trans_start,
                R.id.profile_trans_end
            )
            binding.motionAnim.transitionToEnd()
        }

    }
}