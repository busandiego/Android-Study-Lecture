package com.android.colormyview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }



    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_text_one, box_two_text, box_three_text, box_four_text, box_five_text, box_constraint,
            red_button, green_button, blue_button)
        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(view: View) {
        when(view.id){
            R.id.box_text_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_four_text.setBackgroundColor(Color.RED)
            R.id.green_button -> box_three_text.setBackgroundColor(Color.GREEN)
            R.id.blue_button -> box_five_text.setBackgroundColor(Color.BLACK)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }
}
