package com.example.android.colorslist.ui.overview

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.android.colorslist.databinding.FragmentOverviewBinding
import com.example.android.colorslist.model.Color


class OverviewFragment : Fragment() {

    private var _binding:FragmentOverviewBinding?= null
    private val binding get() = _binding!!
    private val viewModel: ColorViewModel by viewModels ()
    private lateinit var adapter: ColorAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentOverviewBinding.inflate(inflater,container,false)

        val colorObserver = Observer<List<Color>> {
            adapter.colorList = it
            adapter.notifyDataSetChanged()
        }

        viewModel.getLiveDataList().observe(viewLifecycleOwner,colorObserver)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.recyclerView

        adapter = ColorAdapter(requireContext(), object : ColorAdapter.OnItemClick {
            override fun onItemClickListener(position: Int) {
                val color = adapter.colorList[position]
                val action = OverviewFragmentDirections.actionOverviewFragmentToDetailsFragment(color)
                findNavController().navigate(action)
            }
        })

        recyclerView.adapter = adapter
        recyclerView.hasFixedSize()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}