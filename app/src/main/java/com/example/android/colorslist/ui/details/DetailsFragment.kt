package com.example.android.colorslist.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.android.colorslist.R
import com.example.android.colorslist.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private var _binding:FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val args:DetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding= FragmentDetailsBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = args.color
        when (args.colorRes){
            1->binding.tvColor.setBackgroundResource(R.color.yellow)
            2->binding.tvColor.setBackgroundResource(R.color.red)
            3->binding.tvColor.setBackgroundResource(R.color.blue)
            else->binding.tvColor.setBackgroundResource(R.color.black)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}