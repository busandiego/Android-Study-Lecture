package com.lee.navigationex

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.lee.navigationex.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFirstBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_first, container, false
        )

        binding.playButton.setOnClickListener {
            view: View -> Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
        }

        return binding.root

    }

}