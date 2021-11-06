package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var myName = MyName("수인", "Developer")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // myName의 변수 데이터를 바인딩한 view에 myName 데이터에 맵핑 시킨다.
        binding.myName = myName

        binding.doneButton.setOnClickListener {
            showDescription(it)
        }

    }

    private fun showDescription(view: View) {

       /* binding.description.visibility = View.VISIBLE
        binding.editText.visibility = View.GONE*/

        binding.apply {
            invalidateAll()
            myName
            description.visibility = View.VISIBLE
            editText.visibility = View.GONE
        }


        // Hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
