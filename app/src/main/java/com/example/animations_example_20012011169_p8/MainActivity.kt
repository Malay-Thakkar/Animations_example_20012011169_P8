package com.example.animations_example_20012011169_p8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun fade(view: View) {
        val myTV1 = findViewById<TextView>(R.id.textView)

        myTV1.visibility = View.VISIBLE
        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade)
        myTV1.startAnimation(animationFadeIn)
    }
    fun fadeout(view: View) {
        val myTV2 = findViewById<TextView>(R.id.textView)

        myTV2.visibility = View.VISIBLE
        val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        myTV2.startAnimation(animationFadeOut)
    }
    fun zoomin(view: View) {
        val myTV3 = findViewById<TextView>(R.id.textView)

        myTV3.visibility = View.VISIBLE
        val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        myTV3.startAnimation(animationZoomIn)
    }
    fun zoomout(view: View) {
        val myTV4 = findViewById<TextView>(R.id.textView)

        myTV4.visibility = View.VISIBLE
        val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
        myTV4.startAnimation(animationZoomOut)
    }
    fun slidedown(view: View) {
        val myTV5 = findViewById<TextView>(R.id.textView)

        myTV5.visibility = View.VISIBLE
        val animationSlidedownown = AnimationUtils.loadAnimation(this, R.anim.slide_down)
        myTV5.startAnimation(animationSlidedownown)
    }
    fun slideup(view: View) {
        val myTV6 = findViewById<TextView>(R.id.textView)

        myTV6.visibility = View.VISIBLE
        val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.slide_up)
        myTV6.startAnimation(animationFadeOut)
    }
    fun bounce(view: View) {
        val myTV7 = findViewById<TextView>(R.id.textView)

        myTV7.visibility = View.VISIBLE
        val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
        myTV7.startAnimation(animationBounce)
    }
    fun rotate(view: View) {
        val myTV8 = findViewById<TextView>(R.id.textView)

        myTV8.visibility = View.VISIBLE
        val animationRotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        myTV8.startAnimation(animationRotateAnimation)
    }

}